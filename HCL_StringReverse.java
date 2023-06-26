import java.util.Scanner;

public class HCL_StringReverse {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the String :");
		String Str = Ask.nextLine();
		Ask.close();
		
		 for(int i = Str.length()-1; i>=0;i--){
			 System.out.print(Str.charAt(i));
		 }
	}
}
