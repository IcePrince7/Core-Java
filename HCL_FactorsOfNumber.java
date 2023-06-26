import java.util.Scanner;

public class HCL_FactorsOfNumber {
	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Num = Ask.nextInt();
		Ask.close();
		
		int i =1;
		while(i<=Num) {
			if(Num %i ==0)
				System.out.print(i+" ");
			i++;
		}
	}

}
