package july_29;

public class VarArgs_java {
	public static void main(String args[])
	{
		System.out.println(sum());
		System.out.println(sum(1,2,3,4,5));
		System.out.println(sum(45));
		int[] ar1= {34,56,78,90};
		System.out.println(sum(ar1));
	}
	
	
	/*
	 * var-args- its represented utilizing ...(3 dots)
	 * it should be the last parameter of the method
	 * 
	 */
	public static int sum(int ...a)
	{
		int ans=0;
		for(int i:a) {
			ans=ans+i;
		}
		return ans;
	}
}
