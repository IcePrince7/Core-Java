package Basic;

import java.util.concurrent.ThreadLocalRandom;

public class HCL_RandomNum2 {

	public static void main(String[] args) {

		int randomnum = ThreadLocalRandom.current().nextInt(100, 999);
		System.out.println(randomnum);
	}
}
