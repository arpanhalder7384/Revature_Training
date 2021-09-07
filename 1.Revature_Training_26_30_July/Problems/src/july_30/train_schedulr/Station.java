package july_30.train_schedulr;

public class Station{
	protected String stnCode;
	protected String name;
	private double deptime;
	private double arrtime;
	protected int srlNo=0;
	public Station(String stnCode, String name) {
		this.stnCode = stnCode;
		this.name = name;
		this.srlNo++;
	}
	public Station(String stnCode, String name,double dt,double at) {
		this(stnCode,name); //Constructor Chaining
		this.deptime=dt;
		this.arrtime=at;
	}
	
	public void showDetails()
	{
//		System.out.printf("%-4d %-6s %-16s %-8f %-8.2f\n",1,this.stnCode,this.name,this.arrtime,this.deptime);
		System.out.printf("%-8s %-20s %05.2f %-2s %05.2f\n",this.stnCode,this.name,this.arrtime,"",this.deptime);
	}
	
	public static void main(String args[])
	{
		System.out.println("-------------------------------------------");
		System.out.printf("%-4s %-6s %-16s %-8s %-8s\n","#","Code","Station","Arr.","Dep.");
		System.out.println("-------------------------------------------");
//		Station s=new Station("GTL","Guntakal Jn",03.50,03.55);
//		s.showDetails();
//		StartingStn s1=new StartingStn("GTL","Guntakal Jn",03.50);
//		s1.showDetails();
//		EndStn s2=new EndStn("GTL","Guntakal Jn",03.50);
//		s2.showDetails();
	}
	public static String getDateFormat()
	{
		return "";
	}
}

class StartingStn extends Station{
	private double time;
	public StartingStn(String stnCode, String name,double t)
	{
		super(stnCode,name);
		this.time=t;
		this.srlNo++;
	}
	public void showDetails()
	{
		System.out.printf("%-8s %-20s %-8s %05.2f\n",this.stnCode,this.name,"",this.time);
	}
}

class EndStn extends Station{
	private double time;
	public EndStn(String stnCode, String name,double t)
	{
		super(stnCode,name);
		this.time=t;
		this.srlNo++;
	}
	public void showDetails()
	{
		System.out.printf("%-8s %-20s %05.2f %-8s\n",this.stnCode,this.name,this.time,"");
	}
}
