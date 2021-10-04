import java.util.*;

public class Sep_20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		LinkedHashSet<Character> arr=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			arr.add(s.charAt(i));
		}
		arr.stream().sorted();
		arr.stream().forEach(i->{
			System.out.print(i);
		});
	}

}
