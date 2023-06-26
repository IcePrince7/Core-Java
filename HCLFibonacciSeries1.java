package Basic;
import java.util.Scanner;
public class HCLFibonacciSeries1 {
	public static void main(String[] args) {
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int Num = Ask.nextInt();
		Ask.close();
		int pre = 0;
		int post = 1;
		int res = 0;
		;
		int i = 1;
		while (i <= Num) {
			System.out.print(pre + " ");
			res = pre + post;
			pre = post;
			post = res;
			i++;
		}
	}

}
