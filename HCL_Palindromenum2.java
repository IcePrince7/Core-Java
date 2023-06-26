package Basic;

import java.util.Scanner;

public class HCL_Palindromenum2 {
	public static void main(String[] args) {

		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Num = Ask.nextInt();
		Ask.close();
		int Rem, Sum = 0, Temp;
		int n = 454;
		Temp = Num;
		while (Num > 0) {
			Rem = Num % 10;
			Sum = (Sum * 10) + Rem;
			Num /= 10;
		}
		if (Temp == Sum)
			System.out.printf("%d is a Palindrome Number", Temp);
		else
			System.out.printf("%d is not a Palindrome Number", Temp);
	
	}
}
