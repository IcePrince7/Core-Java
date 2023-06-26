import java.util.Scanner;

public class MultiFloat {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);

		System.out.println("Enter your 1st Decimal Number :");
		float Num1 = Ask.nextFloat();
		
		System.out.println("Enter your 2nd Decimal Number :");
		float Num2 = Ask.nextFloat();
		Ask.close();
		
		System.out.println("The Multiplied Value : "+(Num1 * Num2));
		 
	}
}
