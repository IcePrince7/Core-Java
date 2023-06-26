package Basic;
import java.util.Scanner;
public class HCLPrimeNumber2 {
	public static void main(String[] args) {
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Num = Ask.nextInt();
		Ask.close();
		boolean flag = true;
		for(int i =Num-1 ; i>=2;i--) {
			if(Num ==1||Num==0) {
				flag = false;
				break;
			}
			if(Num % i ==0) {
				flag = false;
				break;
			}
		}
		if(flag)	System.out.printf("%d is a prime number ",Num);
		else 		System.out.printf("%d is not a prime number ",Num);	
	}
}
