import java.util.Scanner; 
public class HCL_MethodNoParameter { 

	void area() { 
 		System.out.println("Enter the radius :"); 
 		Scanner scan = new Scanner(System.in); 
 		float r = scan.nextFloat(); 
 		float ar; 
 		scan.close(); 
 		ar = (r * r) * 22 / 7; 
 		System.out.println("Area of the circle is : "+ar+" Sq.units"); 
 	} 

	public static void main(String[] args) { 
		HCL_MethodNoParameter NP= new HCL_MethodNoParameter(); 
 		NP.area(); 
 	} 
} 