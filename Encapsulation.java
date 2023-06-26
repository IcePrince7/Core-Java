class Student{
	  private String name = "Varun";
	  private int age =30;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println();
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	  
	   
}

public class Encapsulation{
	 public static void main(String[] args) {
		
		 Student st = new Student();
		 st.setNAme("VAmsi");
		 System.out.println(st.getName());
	}
 }