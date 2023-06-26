public class HCL_MethodOverloading { 
	void record(String studentname,char grade) { 
		System.out.println("Student name is "+studentname);
		System.out.println("Student grade is "+grade); 
	} 
	void record(int id,String studentname,char grade) { 
		System.out.println("Student ID is "+id); 
		System.out.println("Student name is "+studentname); 
		System.out.println("Student grade is "+grade); 
	} 
	public static void main(String[] args) { 
		HCL_MethodOverloading Obj = new  HCL_MethodOverloading(); 
		Obj.record(6475,"Jachie",'A'); 
		Obj.record(3556, "Chan", 'O'); 
	} 

} 	

