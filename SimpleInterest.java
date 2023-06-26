import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		
		System.out.println("Enter Principle Amount :");
		float Total = Ask.nextFloat();
		System.out.println("Enter Interest rate :");
		float Int = Ask.nextFloat();
		System.out.println("Enter Time Period :");
		float Time = Ask.nextFloat();
		Ask.close();
		
		System.out.println("Your Simple Interest is "+(Total * Int * Time)/100);
		
	}
}
