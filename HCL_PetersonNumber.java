package Numbers;

import java.util.Scanner;

public class HCL_PetersonNumber {

	public static void main(String[] args) {
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int Num = Ask.nextInt();
		Ask.close();

		int temp = Num, Res = 0;
		while (temp > 0) {
			int Fact = 1;
			for (int i = temp % 10; i > 1; i--) {
				Fact = Fact * i;
			}
			temp /= 10;
			Res += Fact;
		}
		if (Num == Res)
			System.out.printf("%d is a Peterson number", Num);
		else
			System.out.printf("%d is not a Peterson number", Num);
	}
}
