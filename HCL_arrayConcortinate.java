import java.util.Arrays;

public class HCL_arrayConcortinate {

	public static void main(String[] args) {
		
		int intArray1[] = {3,4,5,6,7,8};
		int intArray2[] = {22,23,24};
		int CombinedArray[] =new int[intArray1.length +intArray2.length];
		
		
		System.arraycopy(intArray1, 0, CombinedArray, 0, intArray1.length);
		System.arraycopy(intArray2, 0, CombinedArray, intArray1.length, intArray2.length);
		
		System.out.println("Your array : "+Arrays.toString( CombinedArray));
	}
}
