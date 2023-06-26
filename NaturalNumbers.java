import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int Num1 = Ask.nextInt();
		System.out.println("Enter the 2nd Number");
		int Num2 = Ask.nextInt();
		Ask.close();
		
		if(Num1 >0 && Num2 >0) {
			System.out.println("The added value of ur Natural Number is : "+(Num1+Num2));
		}
		else		System.out.println("Natural Number only");
		
	}
}
