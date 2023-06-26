import java.util.Scanner;

public class CompountInterest {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		
		System.out.println("Enter Principle Amount :");
		float Total = Ask.nextFloat();
		System.out.println("Enter Interest rate :");
		float Int = Ask.nextFloat();
		System.out.println("Enter Time Period :");
		float Time = Ask.nextFloat();
		Ask.close();
		
		Double Res =Total *(Math.pow((1+Int/100), Time) );
		System.out.println("Your Compount Interest is "+Res);
		
	}
}
