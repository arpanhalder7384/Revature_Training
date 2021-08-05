package july_30.train_schedulr;

interface Train_Structure{
	public void setStartingDetails(String s1,String s2,double dTime);
	public void setEndDetails(String s1,String s2,double aTime);
	public void setNoOfStops();
}

public class Train implements Train_Structure{
	private int trainNo;
	private double DeptTime,arriTime;
	private String trainName;
	private StartingStn startingStation;
	private EndStn endStation;
	private Station[] stns;
	private int noOfStops=0;

	public Train(int trainNo,String trainName,double d,double a) {
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.DeptTime=d;
		this.arriTime=a;
	}

	public static void main(String[] args) {
		Station stopLst[]= {
				new Station("GTL","Guntakal Jn",03.45,03.50),
				new Station("SC","Secundrabad Jn",08.55,09.10),
				new Station("BPQ","Balharshah",13.30,13.35),
				new Station("HBJ","Habibganj",21.20,21.25),
				new Station("JHS","Jhansi Jn",01.15,1.20),
		};
		Train t1=new Train(12213,"AC Duronto Express",23.40,07.00);
		t1.setStartingDetails("YPR","Yasvantpur Jn",t1.getDeptTime());
		t1.setEndDetails("DEE", "Delhi S Rohilla",t1.getArriTime());
		t1.setStops(stopLst);
		t1.showDetails();
	}
	
	public double getDeptTime() {
		return DeptTime;
	}

	public double getArriTime() {
		return arriTime;
	}

	public void setStops(Station s[])
	{
		this.stns=s;
		for(int i=0;i<s.length;i++)
		{
			this.setNoOfStops();
		}
	}
	
	public void setStartingDetails(String s1,String s2,double dTime)
	{
		this.startingStation=new StartingStn(s1,s2,dTime);
//		this.deptTime=dTime;
	}
	
	public void setEndDetails(String s1,String s2,double aTime)
	{
		this.endStation=new EndStn(s1,s2,aTime);
//		this.arriTime=aTime;
	}
	
	public void setNoOfStops()
	{
		this.noOfStops+=1;
	}
	public void showDetails()
	{
		System.out.println(this.startingStation.name+" "+this.endStation.name+" "+this.trainName+" ("+this.trainNo+")");
		System.out.println("---------------------------------------------------");
		System.out.printf("%-6s %-8s %-20s %-8s %-8s\n","#","Code","Station","Arr.","Dep.");
		System.out.println("---------------------------------------------------");
		System.out.printf("%-7d",1);
		this.startingStation.showDetails();
		for(int i=0;i<5;i++)
		{
			System.out.printf("%-7d",i+2);
			this.stns[i].showDetails();
		}
		System.out.printf("%-7d",this.noOfStops+2);
		this.endStation.showDetails();
	}
}
