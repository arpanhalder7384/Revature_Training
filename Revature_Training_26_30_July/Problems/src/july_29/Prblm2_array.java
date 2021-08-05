package july_29;

import java.util.*;

public class Prblm2_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1[]=sc.nextLine().split(" ");
		
//		System.out.println(removeDup(s1));
		removeDup(s1);
	}
	public static void removeDup(String s1[])
	{
		int n=0;
		int ar1[]=new int[s1.length];
		for(int i=0;i<s1.length;i++)
		{
			ar1[i]=Integer.parseInt(s1[i]);
		}
		Arrays.sort(ar1);
		
		int ar2[]=new int[ar1.length];
		for(int i=0;i<ar1.length;i++)
		{
			ar2[i]=ar1[i];
		}
		for(int i=0;i<ar1.length;i++)
		{
			System.out.print(ar1[i]+" ");
		}
//		int count=0;
//		for(int i=0;i<ar1.length;i++)
//		{
//			if(ar2[count]!=ar1[i])
//			{
//				count++;
//				ar2[count]=ar1[i];
//			}
//		}
//		for(int i=0;i<ar2.length;i++)
//		{
//			System.out.print(ar2[i]+" ");
//		}
	}
}
