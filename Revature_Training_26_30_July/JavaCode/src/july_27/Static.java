package july_27;

public class Static {
	static int x;
	
	public Static() {
		System.out.println("Static Class Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Hello from main");
		iAmStatic();
		Static s1=new Static();
		s1.iAmNonStatic();
		System.out.println();
//		Calci.iAmStatic();		
//		Calci c1=new Calci();
//		c1.iAmNonStatic();
	}
	public static void iAmStatic() {
		System.out.println("Static Class-> static Method");
	}
	public void iAmNonStatic() {
		System.out.println("Static Class-> Non static Method");
	}
	
	static {
		System.out.println("Static class-> Anonymous Static Block");
	}
	
	{
		System.out.println("Static class-> Anonymous Non Static Block");
	}
}
