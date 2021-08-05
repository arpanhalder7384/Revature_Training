package july_28;

public class Constructor_java {
	public static void main(String args[])
	{
		Employee e1=new Employee(1, "Arpan Halder");
		e1.printEmployee();		
		Employee e2=new Employee(2,"Sam",25,"Delhi");
		e2.printEmployee();
	}
}
class Employee{
	private int id;
	private String name;
	private int age;
	private String city;
	private String designation;
	
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public Employee(int id,String name,int age,String city) {
		this(id,name); //constructor chaining
		this.age=age;
		this.city=city;
		
	}
	public Employee(int id,String name,int age,String city,String designation) {
		this(id,name,age,city);
		this.designation=designation;
	}
	public void printEmployee() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("City : "+city);
		System.out.println("Designation : "+designation);
	}
}