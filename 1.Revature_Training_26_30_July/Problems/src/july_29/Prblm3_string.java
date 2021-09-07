package july_29;

import java.util.Scanner;

public class Prblm3_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		System.out.println(Convert(s1));
	}
	public static String Convert(String s)
	{
		StringBuffer s3=new StringBuffer();
		String s2[]=s.split(" ");
		for(String i:s2)
		{
			if(new StringBuilder(i).reverse().equals(i)) 
			{
				s3.append(i+" ");
			}
			else
			{
				s3.append(new StringBuilder(i).reverse()+" ");
			}
		}
		return s3.toString().trim();
	}

}
