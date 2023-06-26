import java.util.Scanner;
 public class VowelAndConsonant {
 public static void main(String[] args) {
	 	Scanner Ask = new Scanner(System.in);
		String Ch = Ask.next();
		char Letter = Ch.charAt(0);
		int ConvertedToInt = Letter;
 		int [] Ascill = { 97 ,101 ,105,111,117 ,65, 69, 73, 79, 85};
		Boolean flag = false; 
 		
		for (int i : Ascill) {
			if(i == ConvertedToInt)
				flag =true;
		}
		
		if(flag) System.out.println("Its a Vowel ");
		else System.out.println("Its an consonant");
	}
}
