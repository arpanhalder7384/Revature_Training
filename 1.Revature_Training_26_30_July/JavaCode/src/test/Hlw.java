package test;

import java.util.*;
import java.lang.*;


public class Hlw {
	
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++)
        	{
        		arr[i][j]=sc.nextInt();
        	}
        	sc.nextLine();
        }
        int s1=0,s2=0;
        for(int i=0;i<n;i++)
        {
        	s1+=arr[i][i];
        }
        for(int i=0;i<n;i++)
        {
        		s2+=arr[i][n-1-i];
        }
        System.out.println(Math.abs(s1-s2));
    }
}