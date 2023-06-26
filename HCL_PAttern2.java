package Basic;

public class HCL_PAttern2 {

	public static void main(String[] args) {

		char c = 'Z';
		for (int i = 6; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(c-- + " ");
			}
			c = 'Z';
			System.out.println();
		}

	}
}
