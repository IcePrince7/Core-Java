import java.util.Arrays;
import java.util.Scanner;

public class HCL_ObjectArray {

	public static void main(String[] args) {
 		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the Array lenght Size :");
		int Size = Ask.nextInt();
		 Ask.nextLine();
		Object objectArray[] = new Object[Size];
		for(int i=0 ;i<Size ;i++) {
			System.out.println("Enter the "+(i+1)+" value");
			objectArray[i] =Ask.nextLine();
		}
		Ask.close();
 		System.out.println("Your array : "+Arrays.toString(objectArray));
  	}
}
