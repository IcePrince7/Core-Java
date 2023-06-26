import java.util.Scanner;

public class UserInt {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		
		System.out.println("Enter your Number :");
		int A = Ask.nextInt();
		Ask.close();
		
		System.out.println("Entered Number :");
		System.out.println(A);
	}
}
