package july_27;

public class Visisbility_Inner_class {

	public static void main(String[] args) {
		// Public: JVM can find main method
		// static: To call main method, don't need to create object on class
		// void: as java program starts and ends at main so main does't return anything
		//String[]: Command line argu. Its a string array
		System.out.println("Hello");		
	}
	private class InnerPrivate{}
	
	protected class InnerProtected{}
	
	public class InnerPublic{}
	
	public static class InnerStatic{
		public static void hello1()
		{
			System.out.println("Public Static Inner Class->Public Static Method");
		}
		public void hello2() 
		{
			System.out.println("Public Static Inner Class->Public Non Static Method");
		}
	}
	
}

class A{}

class B{}

class C{}
