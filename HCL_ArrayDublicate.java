import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HCL_ArrayDublicate {

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
		
		List<Integer> dublicate = new ArrayList<>();
		
		for(int i=0;i<Size;i++) {
			
			for(int j=i+1;j<Size;j++) {
				if(intArray[i] == intArray[j]) {
					if(dublicate.contains(intArray[i])) 	break;
					else dublicate.add(intArray[i]);
				}
 			}
 		}
		System.out.print("The dublicates :"+dublicate);
 
		
	}
}
