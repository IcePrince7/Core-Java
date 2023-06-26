import java.util.Scanner;

public class Narrowing {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		double Num1 = Ask.nextDouble();
		System.out.println("Enter 2st Number");
		double Num2 = Ask.nextDouble();
		Ask.close();
		float f1 = (float)Num1;
		float f2 = (float)Num2;
		int A = (int)f1;
		int B = (int)f2;
		
		
		if(A+B > 50)		System.out.println("HCL");
		else			System.out.println("HCL Technologies Pvt Ltd");
	}
}
