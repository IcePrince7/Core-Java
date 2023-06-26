import java.util.Scanner;

public class LeapYear {


	public static void main(String[] args) {

		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the year");
		int Year = Ask.nextInt();
		Ask.close();

		if(Year % 100 !=0 && Year % 400 ==0 && Year %4 ==0) {	
				System.out.println("Leap year");
			}
		else 	System.out.println("Non Leap Year");
		  

	}
}
