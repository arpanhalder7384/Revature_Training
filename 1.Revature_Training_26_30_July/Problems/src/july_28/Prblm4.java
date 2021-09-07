package july_28;

import java.util.Scanner;

public class Prblm4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b;
		a=sc.nextDouble();
		sc.nextLine();
		b=sc.nextDouble();
		System.out.println(calc(a,b));
		sc.close();
	}
	public static double calc(double a,double b)
	{
		return(Math.sqrt(a*a+b*b));
	}

}