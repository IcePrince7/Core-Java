import java.util.Scanner;

public class HCL_CharArray {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the Array lenght Size :");
		int Size = Ask.nextInt();
		char charArray[] = new char[Size];
		for(int i=0 ;i<Size ;i++) {
			System.out.println("Enter the "+(i+1)+" index Number");
			charArray[i] =Ask.next().charAt(0);
		}
		Ask.close();
		
		System.out.println("Your array : ");
		 for (char c : charArray) {
			System.out.print(c+" ");
		}
	}
}
