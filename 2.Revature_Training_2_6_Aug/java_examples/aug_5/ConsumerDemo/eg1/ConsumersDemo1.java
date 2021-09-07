package eg1;
import java.util.*;
import java.util.stream.Collectors;
public class ConsumersDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=new ArrayList<>();
		num.add(8);
		num.add(7);
		num.add(2);
		num.add(4);
		num.add(5);
		
		for(Integer i:num)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n\nPrinting using forEach()");
		num.forEach(e->{
			System.out.print(e+" ");
		});
		
		System.out.println();
		num.stream().limit(3).forEach(e->{System.out.print(e+" ");});
		
		System.out.println();
		
		num.stream().limit(3).forEach(System.out::print);
		
		System.out.println();
		num.stream().map(e->e*e).forEach(e->System.out.print(e+" "));
		System.out.println();
		
		List<Integer> sqrlst=num.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println("\nprinting new List Square List from Stream:");
		sqrlst.forEach(e->{
			System.out.print(e+" ");
		});
		System.out.println("\n\nFiltering Stream:");
		num.stream().filter(e->e>5).forEach(e->System.out.print(e+" "));
		
		System.out.println("\n\nSorting Stream:");
		num.stream().sorted().forEach(e->System.out.print(e+" "));
	}
}
