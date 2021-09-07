package task2;
import java.util.*;
import java.util.stream.Collectors;

public class Food_main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Food_item> foodlst=new ArrayList<>();
		foodlst.add(new Food_item("Rice", 2,50));
		foodlst.add(new Food_item("Chili Chicken", 1,250));
		foodlst.add(new Food_item("Chrispy Chicken", 2,300));
		foodlst.add(new Food_item("Hot & Sour Soup", 2,170));
		foodlst.add(new Food_item("Egg Fried Rice", 4,150));
		foodlst.add(new Food_item("French Fry", 2,100));
			
		System.out.println("Billing Details:\n");
		System.out.println("-----------------------------------------");
		System.out.printf("%-16s %-8s %-8s %-8s\n","Item name","Price","Qty.","Total");
		System.out.println("-----------------------------------------");
		List<String> fname=foodlst.stream().map(e->e.getName()).sorted().collect(Collectors.toList());
//		fname.forEach(System.out::println);
		List<Food_item> fitem=new ArrayList<>();
		for(int i=0;i<fname.size();i++)
		{
			fitem.add(getItem(foodlst,fname.get(i)));
		}
		fitem.forEach(e->e.showDetails());
	}
	public static Food_item getItem(List<Food_item> foodlst, String s)
	{
		for(int i=0;i<foodlst.size();i++)
		{
			if(foodlst.get(i).getName().equals(s))
			{
				return foodlst.get(i);
			}
		}
		return foodlst.get(0);
	}

}
