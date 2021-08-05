package july_29;

import java.util.*;

public class Arrays_java {

	public static void main(String[] args) {
		int[] ar1= {12,13,34,55,6,77,44,88};
		
		System.out.println("Contents of array using for loop:");
		for(int i=0;i<ar1.length;i++)
		{
			System.out.print(ar1[i]+" ");
		}
		System.out.println("\n\nContents of array using for each loop:");
		for(int i:ar1)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n\n"+Arrays.toString(ar1));
		
		int ar2[]=new int[10];
		ar2[0]=99;
		ar2[1]=100;
		ar2[2]=45;
		ar2[3]=55;
		ar2[4]=22;
		int n=5;
		System.out.println("\nContetns of array's are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar2[i]+" ");
		}
		
		int newele=1000;
		int pos=1;
		
		for(int i=n;i>pos-1;i--)
		{
			ar2[i]=ar2[i-1];
		}
		ar2[pos-1]=newele;
		n++;
		System.out.println("\n\nContetns of array's are after inserting 1 element:");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar2[i]+" ");
		}
				
	}

}
