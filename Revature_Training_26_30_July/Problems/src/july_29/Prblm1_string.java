package july_29;
import java.util.*;

public class Prblm1_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		System.out.println(lastUpperCase(s1));
	}	
	public static String lastUpperCase(String s)
	{
		StringBuffer s3=new StringBuffer();
		String s2[]=s.split(" ");
		for(String i:s2)
		{
			s3.append(i.substring(0,i.length()-1)+Character.toUpperCase(i.charAt(i.length()-1))+" ");
		}
		return s3.toString().trim();
	}
}
