import java.util.Scanner;
 public class LargestThreeNumber{
 	public static void main(String[] args) {
 		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int Num1 = Ask.nextInt();
		System.out.println("Enter 2st Number");
		int Num2 = Ask.nextInt();
		System.out.println("Enter 3rd Number");
		int Num3 = Ask.nextInt();
		Ask.close();
		
		if(Num1 > Num2 && Num1> Num3)		System.out.printf("%d is the largest Number",Num1);
		else if(Num2 > Num1 && Num2 >Num3)	System.out.printf("%d is the largest Number",Num2);
		else if(Num3 > Num1 && Num3 >Num2)	System.out.printf("%d is the largest Number",Num3);
		else								System.out.println("Some Values are Same");
	}
}
