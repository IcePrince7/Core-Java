import java.util.Arrays;
import java.util.Scanner;

public class HCL_EvenArray {

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
		System.out.println("Original Array :"+Arrays.toString(intArray));
		System.out.print("The element present in even position is " );
		for(int i=0 ;i<Size;i++) {
			if(intArray[i] %2 ==0)
				System.out.print(intArray[i]+" ");
		}
	}
}
