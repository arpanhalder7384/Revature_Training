package july_29;

import java.util.Scanner;

public class Prblm5_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1[]=sc.nextLine().split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(checkFstLst(s1[i]));
		}
	}
	public static String checkFstLst(String s)
	{
		if(s.charAt(0)!=s.charAt(s.length()-1))
		{
			return s+" ";
		}
		return "";
	}

}
