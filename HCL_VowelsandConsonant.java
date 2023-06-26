import java.util.Scanner;

public class HCL_VowelsandConsonant {

	public static void main(String[] args) {

		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the String :");
		String Str = Ask.nextLine();
		Str= Str.toLowerCase();
		Ask.close();
		int Consonant =0 , Vowels=0;

		char index ;
		int i=0;
		do {
			index =Str.charAt(i);  
			if(index >=97 && index<=122) {
				if(index =='a'||index =='e'||index =='i'||index =='o'||index =='u') {
					Vowels++;
				}
				else Consonant++;
			}
			i++;
		}while(Str.length() >i);

		System.out.printf("Total Vowels : %d%nTotal Consonant : %d",Vowels,Consonant);
	}

}
