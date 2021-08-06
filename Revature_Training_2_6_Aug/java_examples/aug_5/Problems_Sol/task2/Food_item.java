package task2;

public class Food_item {
	private String name;
	private int quantity;
	private double price;
	private double item_total;
	public double getItem_total() {
		return item_total;
	}
	public void setItem_total(double item_total) {
		this.item_total = item_total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public Food_item(String name, int quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private double get_item_total()
	{
		this.item_total=this.quantity*this.price*105/100;
		return this.item_total;
	}
	public void showDetails()
	{
		System.out.printf("%-16s %-8.2f %-8d %-8.2f\n",this.name,this.price,this.quantity,this.get_item_total());
	}
	public static void main(String[] args) {
		Food_item f1=new Food_item("Rice", 2,50);
		System.out.println("-----------------------------------------");
		System.out.printf("%-16s %-8s %-8s %-8s\n","Item name","Price","Qty.","Total");
		System.out.println("-----------------------------------------");
		f1.showDetails();
	}
}
