package july_29;

import java.util.Scanner;

public class Prblm2_string {
	public static void main(String args[])
	{
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
			if(i.length()%2==0) 
			{
				s3.append(Character.toUpperCase(i.charAt(0))+i.substring(1)+" ");
			}
			else
			{
				int l=i.length()/2;
				s3.append(i.substring(0,l)+Character.toUpperCase(i.charAt(l))+i.substring(l+1)+" ");
			}
		}
		return s3.toString().trim();
	}

}
