package Basic;

class A {
	public A() {
		System.out.println("Object Created by default constuctor of A()");
	}

	// inner class of a
	public class innerclassA {
		public innerclassA() {
			System.out.println("Object created for inner cllas of a USing default constructor of A()");
		}
	}
}

public class HCL_ObjCreate1 {

	public static void main(String[] args) {

		A a = new A();
		A.innerclassA b = new A.innerclassA();
	}
}
