package july_29;

import java.util.*;

public class Prblm4_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1[]=sc.nextLine().split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(checkPrime(s1[i]));
		}
	}
	public static String checkPrime(String s) {
		int n=Integer.parseInt(s);
		int h=n/2;
		boolean flag=true;
		if(n==0 || n==1 || n==2)
		{
			return n+ " ";
		}
		for(int i=2;i<h+1;i++)
		{
			if(n%i==0)
			{
				flag=false;
			}
		}
		if(flag==true)
		{
			return n+" ";
		}
		return "";
	}
}
