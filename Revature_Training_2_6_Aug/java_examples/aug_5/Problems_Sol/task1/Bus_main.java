package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import eg1.Bus;
import java.util.*;
public class Bus_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bus> busList=new ArrayList<>();
		busList.add(new Bus(100,"Abc Travels",1200.22,2.3f));
		busList.add(new Bus(101,"Abc Travels",1100.22,4.3f));
		busList.add(new Bus(190,"XYZ Travels",1500.22,2.4f));
		busList.add(new Bus(290,"XYZ Travels",1150.22,2.9f));
		busList.add(new Bus(200,"STX Travels",980.22,4.0f));
		busList.add(new Bus(104,"IJK Travels",1800.22,3.3f));
		busList.add(new Bus(111,"MMP Travels",8500.22,4.8f));
		
		System.out.println("Minimum price in XYZ Travels:");
		List<Double> bl=busList.stream().filter(e->e.getProviderName().equals("XYZ Travels")).map(e->e.getCost()).collect(Collectors.toList());
		System.out.println(Collections.min(bl));
	}

}
