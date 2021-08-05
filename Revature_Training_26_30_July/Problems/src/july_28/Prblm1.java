package july_28;

import java.util.*;
public class Prblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		System.out.println(result(s));
		sc.close();
	}
	public static String result(String s) {
		int p1=s.indexOf("/");
		int p2=s.indexOf("/",8);
		return(s.substring(p1+2,p2));
	}
}
