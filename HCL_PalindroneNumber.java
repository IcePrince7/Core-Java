import java.util.Scanner;

public class HCL_PalindroneNumber {
	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String Num= Ask.next(); 
		Ask.close();
		
		int revIndex =  Num.length()-1;
		Boolean Flag = false;
		for(int i =0 ;i <Num.length()/2;i++) {
			if(Num.charAt(i) == Num.charAt(revIndex) ) 
				Flag=true;
			revIndex--;
			 
		}
		if( Flag)		System.out.println("True");
		else 			System.out.println("False");
	}

}
