import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		
		System.out.println("Enter your 1st Number :");
		int Num1 = Ask.nextInt();
		
		System.out.println("Enter your 2nd Number :");
		int Num2 = Ask.nextInt();
		Ask.close();
		
		
		System.out.println("The Value Before Swap : \nA = "+Num1+"\nB = "+Num2);
		
		Num1 = Num1 + Num2;  
		Num2 = Num1 - Num2;
		Num1 = Num1 - Num2;
		
		System.out.println("The Value After Swap : \nA = "+Num1+"\nB = "+Num2);
	}
}
