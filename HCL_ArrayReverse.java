import java.util.Arrays;
import java.util.Scanner;

public class HCL_ArrayReverse {

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

		int revArray[] = new int[Size];
		int j =0;
		for(int i= Size-1;i>=0;i--) {
			revArray[i] = intArray[j];
			j++;
		}
		System.out.println("Initial array :"+Arrays.toString(intArray));
		System.out.println("Reversed array :"+Arrays.toString(revArray));
	}
}
