package Basic;

import java.util.Scanner;

public class HCl_AutomorphicNumber {
	public static void main(String[] args) {
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int Num = Ask.nextInt();
		Ask.close();
		
		int temp = Num, Square = Num * Num;

		boolean flag = true;
		
		while (Num > 0) {
			if (Num % 10 != Square % 10) {
				flag = false;
				break;
			}
			Num /= 10;
			Square /= 10;
		}
		
		if (flag)
			System.out.printf("%d is an AutomorphicNumber", temp);
		else
			System.out.printf("%d is not an AutomorphicNumber", temp);

	}
}
