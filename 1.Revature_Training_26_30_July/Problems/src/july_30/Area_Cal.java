package july_30;

public class Area_Cal {

	public static void main(String[] args) {
		Square s1=new Square(10);
		Square r1=new Rectangle(10,20);
		Square t1=new Trapezium(10,20,30);
		s1.showDetails();
		r1.showDetails();
		t1.showDetails();
		s1.getArea();
		r1.getArea();
		t1.getArea();
	}

}
class Square
{
	private int side;
	public Square() {};
	public Square(int s)
	{
		this.side=s;
	}
	public void showDetails()
	{
		System.out.println("Side:"+side);
	}
	public void getArea()
	{
		System.out.println("Area of Square is: "+side*side);
	}
}

class Rectangle extends Square{
	private int height,width;
	public Rectangle() {};
	public Rectangle(int h,int w)
	{
		this.height=h;
		this.width=w;
	}
	public void showDetails()
	{
		System.out.println("Height: "+this.height+"\tWidth"+this.width);
	}
	public void getArea()
	{
		System.out.println("Area of Rectangle is: "+height*width);
	}
}

class Trapezium extends Rectangle{
	private int a,b,h;
	public Trapezium() {};
	public Trapezium(int a,int b, int h)
	{
		this.a=a;
		this.b=b;
		this.h=h;
	}
	public void showDetails()
	{
		System.out.println("A: "+a+"\tB: "+b+"\tC: "+h);
	}
	public void getArea()
	{
		System.out.println("Area of Trapezium is: "+(((a*b)/2)*h));
	}
}
