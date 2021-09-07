package Test;

import java.util.*;

public class Hlw {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		int ar1[]=new int[n];
		String s1[]=sc.nextLine().split(" ");
		System.out.println("Arrays element before insertion:");
		for(int i=0;i<n;i++)
		{
			ar1[i]=Integer.parseInt(s1[i]);
			System.out.print(ar1[i]+" ");
		}
		System.out.println("\n\nEnter Position:");
		int pos=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Data:");
		int ele=sc.nextInt();
		ar1[pos-1]=ele;
		System.out.println("\nArrays element after insertion:");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar1[i]+" ");
		}
	}
}
