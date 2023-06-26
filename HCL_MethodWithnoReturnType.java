 import java.util.Scanner; 
 public class HCL_MethodWithnoReturnType { 

	public int CompareNum(){ 
 		int a; 
 		int b; 
 		Scanner scan= new Scanner(System.in); 
 		System.out.println("Enter the 1st number :"); 
 		a=scan.nextInt(); 
 		System.out.println("Enter the 2nd number :"); 
 		b= scan.nextInt(); 
 		if (a>b) 
 			return a; 
 		else 
 			return b; 
  	} 

	public static void main(String[] args) { 

		HCL_MethodWithnoReturnType rt= new HCL_MethodWithnoReturnType(); 
  		int result= rt.CompareNum(); 
 		System.out.println("The Greatest number is :"+result); 
  	} 
 } 

