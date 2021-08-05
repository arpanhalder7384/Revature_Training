package july_27;

public class Calci {
	public Calci(){
		System.out.println("Hello Calci Constructor");
	}
	
	public static void iAmStatic() {
		System.out.println("Calci Class-> Static method");
	}
	
	public void iAmNonStatic() {
		System.out.println("Calci Class ->Non Static method");
	}
	static {
		System.out.println("Calsi class-> Anonymous Static Block");
	}
	
	{
		System.out.println("Calsi class-> Anonymous Non-Static Block");
	}
}
