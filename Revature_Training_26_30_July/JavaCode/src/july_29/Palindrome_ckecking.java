package july_29;

public class Palindrome_ckecking {

	public static void main(String[] args) {
		System.out.println(checkPal("madam"));
		int x=100;
		System.out.println(checkPal(x+""));
		x=101;
		System.out.println(checkPal(x+""));
	}
	public static boolean checkPal(String s)
	{
		return new StringBuilder(s).reverse().toString().equals(s);
	}
}
