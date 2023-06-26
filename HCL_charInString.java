import java.util.Scanner;

public class HCL_charInString {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the String :");
		String Str = Ask.nextLine();
		Ask.close();
		
		System.out.println("The total character count from String is "+Str.length());
		for(int i =0; i<Str.length();i++) {
			System.out.println((i+1)+" char = "+Str.charAt(i));
		}
	}
}
