package Coding_prblm;

import java.util.*;

public class Vowel_count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(sol(s));
		sc.close();
	}
	
	public static int sol(String s)
	{
		List<String> l1=new ArrayList<>();
		char s2[]=s.toCharArray();
		String s1[]=new String[s2.length];
		for(int i=0;i<s2.length;i++)
		{
			s1[i]=String.valueOf(s2[i]).toUpperCase();
		}
		for(int i=0;i<s1.length;i++)
		{
			if(!l1.contains(s1[i]) && (s2[i]=='A' || s2[i]=='E'  || s2[i]=='I'|| s2[i]=='O' || s2[i]=='U'))
			{
				l1.add(s1[i]);
			}
		}
		return l1.size();
	}
}
