package july_27;

public class Datatype_java {

	public static void main(String[] args) {
		
		int m=10000;
		
//		boolean = byte ->short = char -> int -> float -> double = long
		
//		implicit casting: Smaller to Larger type casting
		long r=m; //implicit casting
		double s=m; //implicit casting
		float p=m; //implicit casting
		System.out.println("r= "+r);
		System.out.println("s= "+s);
		System.out.println("p= "+p);
		
		//explicit casting: Larger to smaller type casting
		
		int o=100;
		char t=(char)o;
		System.out.println("t= "+t);
	}

}
