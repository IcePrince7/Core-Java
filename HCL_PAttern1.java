package Basic;

public class HCL_PAttern1 {

	public static void main(String[] args) {

		char c = 'A';
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c++ + " ");
			}
			c = 'A';
			System.out.println();
		}
	}
}
