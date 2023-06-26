class HCL{
	static String Chairman = "ShivNadar";
	public HCL(String name,int Sapid,String Catagory) {
		System.out.printf("%s(%d) in the field of %s under the ceo %s%n",name,Sapid,Catagory,Chairman);
	}
}
public class HCL_StaticExample {

	public static void main(String[] args) {
		
		new HCL("Sakthi",52051063,"Tester");
		new HCL("Thakshan",52051064,"Developer");
		new HCL("Venkat ram",52051065,"MArketManager");
	}
}
