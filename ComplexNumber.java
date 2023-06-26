import java.util.Scanner;

public class  ComplexNumber {
	public static void main(String[] args) {
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter Your 1st Complex Number Separated by space");
		String ComplexString1 = Ask.nextLine();
		String [] Num1 = ComplexString1.split(" ");
		 int R1= Integer.parseInt(Num1[0]);
		int c1= Integer.parseInt(Num1[1]); 	System.out.println("Enter Your 2nd Complex Number Separated by space");
		String ComplexString2 = Ask.nextLine();
		String [] Num2 = ComplexString2.split(" ");
		 int R2= Integer.parseInt(Num2[0]);
		int c2= Integer.parseInt(Num2[1]);
		System.out.printf("The Added real number = %d%nand Imaginary number = %d%n",(R1 +R2), (c1+c2));
 		Ask.close();
	}}
