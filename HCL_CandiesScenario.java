import java.util.Scanner;

public class HCL_CandiesScenario {

	public static void main(String[] args) {
		Scanner Ask = new Scanner(System.in);
		//Assuming Candies count as 30
		int Candies =30;
		int reqCandies;
		while(Candies>0){
				System.out.println("Enter the Candies that You want :");
				reqCandies= Ask.nextInt();
			if(reqCandies<=Candies) {
				Candies -=reqCandies;
				System.out.println("Kindly collect the Candies.\nAvailable candies : "+Candies);
			}
				
		}
		System.out.println("All candies were Distributed ");
	}
}
