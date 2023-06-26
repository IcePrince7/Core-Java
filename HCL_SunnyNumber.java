package Numbers;

import java.util.Scanner;

public class HCL_SunnyNumber {

	public static void main(String[] args) {
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int Num = Ask.nextInt();
		Ask.close();

		boolean flag = false;
		int temp = Num+1;
		for (int i = 2; i <= Num/2; i++) {
			if (i * i == temp) {
			flag = true;
			break;
		}
		}
		if (flag)
			System.out.printf("%d is a Sunny number", Num);
		else
			System.out.printf("%d is not a Sunny number", Num);
	}

}
