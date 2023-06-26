import java.util.Arrays;
import java.util.Scanner;

public class HCL_TwoMatricesAdd {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the length (R *C) ");
		int Dimension = Ask.nextInt();
		int twodArray1[][]= new int[Dimension][Dimension];
		int twodArray2[][]= new int[Dimension][Dimension];
		int ResultArray3[][]= new int[Dimension][Dimension];
		
		System.out.println("Enter values for the 1st matrix ");
		for(int i = 0;i<Dimension;i++) {
			for(int j =0 ;j <Dimension;j++ ) {
				twodArray1[i][j] = Ask.nextInt();
			}
		}
		System.out.println("Enter values for the 2nd matrix ");
		for(int i = 0;i<Dimension;i++) {
			for(int j =0 ;j <Dimension;j++ ) {
				twodArray2[i][j] = Ask.nextInt();
			}
		}
		
		Ask.close();
		
		for(int i = 0;i<Dimension;i++) {
			for(int j =0 ;j <Dimension;j++ ) {
				ResultArray3[i][j] = twodArray1[i][j] +twodArray2[i][j];
			}
		}
		System.out.println("The Added matrix is : "+Arrays.deepToString(ResultArray3));
		}
	}