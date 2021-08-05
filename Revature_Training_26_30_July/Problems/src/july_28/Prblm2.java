package july_28;

import java.util.*;

public class Prblm2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(result(s));
		sc.close();
	}
	public static String result(String s) {
		if(s.substring(0,5).equals("https"))
		{
			return "Secure";
		}
		else {
			return "Not Secure";
		}
	}

}
