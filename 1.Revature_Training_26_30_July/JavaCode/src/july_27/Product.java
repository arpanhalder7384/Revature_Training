package july_27;

public class Product {
	
	private int pid;
	private String name;
	private double price;
	private static float discount=2.5f;

	public static void main(String[] args) {
		Product p1=new Product();
		p1.name="Shirt";
		p1.pid=78;
		p1.price=1500.58;
		p1.printProduct();
		
		discount=5.5f;
		Product p2=new Product();
		p2.name="Shoe";
		p2.pid=58;
		p2.price=4500.58;
		p2.printProduct();
		
	}
	
	public void printProduct() {
		System.out.println("Product id: " +pid);
		System.out.println("Product name: " +name);
		System.out.println("Product price: " +price);
		System.out.println("Product discount: " +discount+"\n");
	}

}
