import java.util.Iterator;

abstract class Mobile{
    String Mic ,processor;
    int megapixel;
    abstract void call();
    abstract void sms();
    abstract void Action();
}
class Iphone  extends Mobile{
    @Override
    void call()         {  System.out.println("Call");      }
    void sms()           {         }
    void Action()        {        }
    void emergencySOS() {        }
}
class Samsung extends Mobile{
    void call() {        }
    void sms() {         }
    void Action() {        }
}
public class Abstraction {

	public static void main(String[] args) {
		Mobile Ios = new Iphone();
		 +
	}
}
