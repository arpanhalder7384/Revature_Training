package july_29;

import java.util.*;

public class Prblm3_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1[]=sc.nextLine().split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(checkPal(s1[i]));
		}
	}
	public static String checkPal(String s)
	{
		if(new StringBuffer(s).reverse().toString().equals(s)) {
			return s+" ";
		}
		else
		{
			return "";
		}
	}
}
