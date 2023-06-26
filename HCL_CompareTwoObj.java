package Basic;

class Name {
	public Name(String name, int age) {
		this.name = name;
		Age = age;
	}

	String name;
	int Age;

	@Override
	public boolean equals(Object obj) {
//		System.out.println(obj.toString());
		return super.equals(obj);
	}
}

public class HCL_CompareTwoObj {

	public static void main(String[] args) {

		Name n1 = new Name("Sakthi", 22);
		Name n2 = new Name("Sakthi", 22);

		System.out.println(n1.equals(n2));
	}
}
