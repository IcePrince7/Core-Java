import java.util.Arrays;
import java.util.Scanner;

public class HCL_TransposeMatrix {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the length (R *C) ");
		int Dimension = Ask.nextInt();
		int twodArray[][]= new int[Dimension][Dimension];
	 	
		System.out.println("Enter values for the matrix ");
		for(int i = 0;i<Dimension;i++) {
			for(int j =0 ;j <Dimension;j++ ) {
				twodArray[i][j] = Ask.nextInt();
			}
		}
		
		int TransposeMAtrix[][]= new int[Dimension][Dimension];
		for(int i = 0;i<Dimension;i++) {
			for(int j =0 ;j <Dimension;j++ ) {
				TransposeMAtrix[j][i] = twodArray[i][j];
			}
		}
		System.out.println("The transposed matrix is "+Arrays.deepToString(TransposeMAtrix));
	}
}
