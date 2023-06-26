package Basic;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num = Ask.nextInt();
		Ask.close();
		int Fact =1;
		for(int i = 1 ;i<=Num; i++) {
			Fact = Fact *i;
		}
		System.out.println("The factorial of "+Num+" is "+Fact);
	}
		
	}

