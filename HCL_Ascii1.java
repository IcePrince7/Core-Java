package Basic;

import java.util.Scanner;

public class HCL_Ascii1 {

	public static void main(String[] args) {
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter a Char");
		char input = Ask.next().charAt(0);
		Ask.close();
		System.out.println("The Asciil values of " + input + " is " + (int) input);
	}
}
