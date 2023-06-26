package Basic;

import java.util.Scanner;

public class HCL_Armstrong1 {

	public static void main(String[] args) {

		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String TEMP = Ask.next();
		int Num = Integer.parseInt(TEMP);
		Ask.close();

		int Res = 0;
		double Counter = 0;
		int i = 1;
		while (i <= TEMP.length()) {
			Counter = Math.pow((Num % 10), (TEMP.length()));
			Res += Counter;
			Num /= 10;
			i++;
		}
		if (Res == Integer.parseInt(TEMP))
			System.out.printf("%s is an Armstrong Number ", TEMP);
		else
			System.out.printf("%s is not an Armstrong Number ", TEMP);

	}
}
