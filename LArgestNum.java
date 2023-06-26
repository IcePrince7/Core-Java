import java.util.Scanner;
 public class LArgestNum {
 	public static void main(String[] args) {
  		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int Num1 = Ask.nextInt();
		System.out.println("Enter 2st Number");
		int Num2 = Ask.nextInt();
		Ask.close();
		
		if(Num1 > Num2)			System.out.printf("%d is the largest Number",Num1);
		else if(Num1 < Num2)	System.out.printf("%d is the largest Number",Num2);
		else 					System.out.println("Equal Number");
	}
}
