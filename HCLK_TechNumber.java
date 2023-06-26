package Numbers;

import java.util.Scanner;

public class HCLK_TechNumber {

	public static void main(String[] args) {

		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter a Number :");
		String Num = Ask.next();
		int num =Integer.parseInt(Num);
		Ask.close();
		
		int firstHalf = num / 10, secondHalf = num % 10, Res = 0;
		for (int i = 1; i <= Num.length() ; i++) {
			if (Num.length() / 2 > i) {
			firstHalf /= 10;
			secondHalf %= 10;

		}
			System.out.println(firstHalf + " " + secondHalf);
		}
//		int i =1;
//
//
//	 Res = firstHalf+secondHalf;
//		Res *= Res;
//		if(Res ==num)
//			System.out.println("yes");
	}
}
