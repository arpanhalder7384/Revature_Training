package july_27;

public class Person_cls {
	private int id;
	private String name;
	private int age;
	
	public Person_cls()
	{
		
	}
	public Person_cls(int i,int age,String name)
	{
		this.id=i;
		this.age=age;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}


