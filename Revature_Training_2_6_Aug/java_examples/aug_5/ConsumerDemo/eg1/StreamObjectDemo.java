package eg1;

import java.util.*;
import java.util.stream.Collectors;
public class StreamObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bus> busList=new ArrayList<>();
		busList.add(new Bus(100,"Abc Travels",1200.22,2.3f));
		busList.add(new Bus(101,"Abc Travels",1100.22,4.3f));
		busList.add(new Bus(190,"XYZ Travels",1500.22,2.4f));
		busList.add(new Bus(200,"STX Travels",980.22,4.0f));
		busList.add(new Bus(104,"IJK Travels",1800.22,3.3f));
		busList.add(new Bus(111,"MMP Travels",8500.22,4.8f));
		
		System.out.println("High Rated Bus List:\n");
		
		System.out.println("Without StreamAPI:");
		List<Bus> busWithHighRating=new ArrayList<>();
		for(Bus b:busList)
		{
			if(b.getRating()>=4)
			{
				busWithHighRating.add(b);
			}
		}
		
		for(Bus b:busWithHighRating) {
			System.out.println(b);
		}
		
		System.out.println("\n\nUsing StreamAPI:");
		List<Bus> lb=busList.stream().filter(e->e.getRating()>=4).collect(Collectors.toList());
		lb.forEach(System.out::println);
		
		System.out.println("\nAverage Rating of Buses:");
		float total=busList.stream().map(e->e.getRating()).reduce(0.0f,(sum,ele)->sum+ele);
		System.out.println(total/6);
		
		System.out.println("\nAverate Ratings of Abs Buses:");
		float totalAbcRatings=busList.stream().filter(e->e.getProviderName().equals("Abc Travels")).map(e->e.getRating()).reduce(0.0f,(sum,ele)->sum+ele);
		float noOfAbcCount=busList.stream().filter(e->e.getProviderName().equals("Abc Travels")).count();
		System.out.println(totalAbcRatings/noOfAbcCount);
		
	} 

}
