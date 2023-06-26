package Basic;

import java.util.Random;

public class HCL_RandomNum1 {

	public static void main(String[] args) {
		Random random = new Random();
		long R;
		do {
			R = random.nextInt();
		} while (R < 100);

		// Positive upto 3digit random number
		System.out.println(R / 10000000);
	}
}
