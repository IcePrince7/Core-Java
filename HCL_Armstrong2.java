package Basic;

import java.util.Scanner;

public class HCL_Armstrong2 {

	public static void main(String[] args) {

		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Num = Ask.nextInt();
		Ask.close();

		int Temp = Num, Lenght = 0;
		while (Temp > 0) {
				Lenght++;
				Temp /= 10;
		}
		Temp = Num;
		int i = 1, Res = 0;
		double Counter;
		while (i <= Lenght) {
			Counter = Math.pow((Num % 10), Lenght);
			Res += Counter;
			Num /= 10;
			i++;
		}
		if (Res == Temp)
			System.out.printf("%d is an Armstrong Number ", Temp);
		else
			System.out.printf("%d is not an Armstrong Number ", Temp);
	}
}
