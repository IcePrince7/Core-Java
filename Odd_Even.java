import java.util.Scanner;

public class Odd_Even {

	
	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		int Num = Ask.nextInt();
		Ask.close();
		
		if(Num % 2 == 0)	System.out.println("Even Number");
		else 				System.out.println("Odd Number");
	}
}
