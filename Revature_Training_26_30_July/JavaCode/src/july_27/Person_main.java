package july_27;

public class Person_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_cls p1=new Person_cls();
		p1.setAge(21);
		p1.setName("Arpan Halder");
		p1.setId(10);
		System.out.println("Persons Details:");
//		System.out.println(p1.getId()+"\n"+p1.getName()+"\n"+p1.getAge());		
		Person_cls p2=new Person_cls(25,21,"Rajesh");
		System.out.println(p2.getId()+"\n"+p2.getName()+"\n"+p2.getAge());
	}
}
