import java.util.Scanner;
class confirmBuy{
	// Assuming User want to buy Iphone 14
		 String PRoduct_Name = "iphone";
	public confirmBuy(String Address) {
		System.out.println("The product "+PRoduct_Name+" will deliver to the "+Address);
	}
	public confirmBuy() {
		System.out.println("Product "+PRoduct_Name+" Added to the cart");
	}
}

public class HCL_ConstructorOverloading {
	
	public static void main(String[] args) {
		Scanner Ask = new Scanner(System.in);
		int choice =0;
		do{
		System.out.println("Press 1 to buy or 2 to add to cart");
		choice =Ask.nextInt();
		if(choice==1) {
			System.out.println("Enter your Address ");
			Ask.nextLine();
			 new confirmBuy(Ask.nextLine());
			 break;
		}
		else if(choice==2) {new confirmBuy();break;}
		else System.out.println("Invalid input");
		}while(choice !=1 || choice !=2);
		Ask.close();
}
}