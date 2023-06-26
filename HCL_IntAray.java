import java.util.Scanner;

public class HCL_IntAray {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the Element Size :");
		int Size = Ask.nextInt();
		int intArray[] = new int[Size];
		for(int i=0 ;i<Size ;i++) {
			System.out.println("Enter the "+(i+1)+" number");
			intArray[i] =Ask.nextInt();
		}
		Ask.close();
		
		System.out.println("Your array : ");
		for (int i : intArray) {
			System.out.print(i+" ");
		}
	}
}
