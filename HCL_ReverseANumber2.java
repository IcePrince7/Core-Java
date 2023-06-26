package Basic;

import java.util.Scanner;

public class HCL_ReverseANumber2 {

	public static void main(String[] args) {
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Num =Ask.nextInt();
		Ask.close();
		
		int temp = Num ,Count =0;
		while(temp > 0) {
			temp/=10;
			Count++;
		}
		int i =1 ,Res;
		while (i <= Count) {
			Res = Num % 10;
			Num = Num / 10;
			System.out.print(Res);
			i++;

	}
}
}
