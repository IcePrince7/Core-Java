class Mobile1{
	String Brand ,Model,MegaPixel;
	int Price;
	public Mobile1(String brand, String model, String megaPixel, int price) {
		Brand = brand;
		Model = model;
		MegaPixel = megaPixel;
		Price = price;
	}
	
	void Display() {
		System.out.println("Brand : "+Brand+"\nModel : "+Model+"\nMegapixel : "+MegaPixel+"\nPrice : "+Price);
	}
}

public class HCL_ObjectCreation {

	public static void main(String[] args) {
		
		Mobile1 Samsung= new Mobile1("Samsung", "F41", "48", 16000);
		Mobile1  Iphone = new Mobile1("Iphone", "13", "48", 128000);
		Samsung.Display();
		Iphone.Display();
	}
}
