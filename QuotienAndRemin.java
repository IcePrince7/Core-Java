import java.util.Scanner;

public class QuotienAndRemin {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
 
		System.out.println("Enter your 1st Number :");
		int Num1 = Ask.nextInt();
		
		System.out.println("Enter your 2nd Number :");
		int Num2 = Ask.nextInt();
		Ask.close();
		
		
		System.out.println("Your Rem : " + Num1%Num2 +" and Quotient :" + Num1/Num2 );
	}
}
