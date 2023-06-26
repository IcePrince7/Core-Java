import java.util.Arrays;
import java.util.Scanner;

public class HCL_MultiplyTwoMatrix {

	public static void main(String[] args) {
		
		Scanner Ask = new Scanner(System.in);
		System.out.println("Enter the length (R *C) ");
		int Dimension = Ask.nextInt();
//		int Dimension =3;
		int twodArray1[][]= new int[Dimension][Dimension];
//		int twodArray1[][]= {{12,8,4},
//				{3,17,14},
//				{9,8,10}
//				
//		};
//		int twodArray2[][]= {{5,19,3},
//				{6,15,9},
//				{7,8,16}
//				
//		};
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
		
		for(int i = 0;i<twodArray1.length;i++) {
			for(int j =0 ;j <twodArray2.length;j++ ) {
				int res =0;
				for(int k=0;k<Dimension;k++) {
					res += twodArray1[i][k] * twodArray2[k][j]; 			 
				}
				ResultArray3[i][j]=res;
			}
		}
		System.out.println("The Multiplied matrix is : "+Arrays.deepToString(ResultArray3));
 
 		}
}
