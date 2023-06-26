import java.util.Scanner;
 public class PositiveAndNegative {
 	public static void main(String[] args) {
 		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num1 = Ask.nextInt(); 
		
		if(Num1 >0 ) 		System.out.println("Positive Number");
		else if(Num1 < 0)	System.out.println("Negative Number");
		else 				System.out.println("Its is Neutral Number");
		Ask.close();
	}
}
