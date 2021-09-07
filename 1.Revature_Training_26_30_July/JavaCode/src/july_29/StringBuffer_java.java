package july_29;

public class StringBuffer_java {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("hello");
		System.out.println("sb1: "+sb1+"\tmemory of sb1: "+System.identityHashCode(sb1));
		sb1.append(" hey").append(123); // StringBuffer is mutable that means we can change value
		System.out.println("sb1: "+sb1+"\tmemory of sb1: "+System.identityHashCode(sb1));
		
		sb1.delete(0, 2);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer("Hello");
		StringBuffer sb3=new StringBuffer("Hello");
		System.out.println(sb2.equals(sb3));
		
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		System.out.println(s1.equals(s2));
		
	}

}
