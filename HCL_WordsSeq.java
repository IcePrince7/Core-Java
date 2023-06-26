import java.util.Scanner;

public class HCL_WordsSeq {

	public static void main(String[] args) {
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter String : ");
		String TEMP = Ask.nextLine();
		String RevArray[] = TEMP.split(" ");
		Ask.close();

		for (int i = RevArray.length - 1; i >= 0; i--) {
			System.out.print(RevArray[i] + " ");
		}

	}
}
