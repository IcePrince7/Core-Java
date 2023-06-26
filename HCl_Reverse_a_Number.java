import java.util.Scanner;

public class HCl_Reverse_a_Number {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String TEMP= Ask.next();
		int Num =Integer.parseInt(TEMP); 
		Ask.close();
		
		System.out.println("The reversal of ur number is : ");
		int i = 1 ,Res =0;
		while(i <= TEMP.length()) {
			Res = Num %10;
			Num = Num /10;
			System.out.print(Res);
			i++;
		}
	}
}
