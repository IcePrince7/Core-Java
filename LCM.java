import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int Num1 = Ask.nextInt();
		System.out.println("Enter 2st Number");
		int Num2 = Ask.nextInt();
		Ask.close();
		//Finding GCD
		int GCD =1;
		for(int i = Num1 ; i>=1 ;i--) {
			if( Num1 % i ==0 && Num2 % i== 0) {
				GCD =i;
				break;
				}
		}
		System.out.println("GCD = "+GCD);
		// Finding LCM
		
		int LCM = (Num1 *Num2) /GCD;
		System.out.printf("The LCM of %d and %d is %d",Num1,Num2,LCM);
		
	}
}
