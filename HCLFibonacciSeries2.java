package Basic;
import java.util.Scanner;
public class HCLFibonacciSeries2 {
public static void main(String[] args) {
	Scanner Ask = new Scanner(System.in);
	System.out.println("Enter the length : ");
	int Num = Ask.nextInt();
	Ask.close();
	int i =1,first =0,second =1,third ;
	System.out.print(first+" ");
	do {
		third = first+second;
		first =second;
		second = third;
		System.out.print(third+" ");
	}while(++i!=Num);
}
}
