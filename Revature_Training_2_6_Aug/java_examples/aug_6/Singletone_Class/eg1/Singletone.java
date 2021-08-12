package eg1;

public class Singletone {
	public static Singletone obj=null;
	private int var=0;
	
	private Singletone()
	{
		
	}
	public static Singletone getSingletoneInstance() {
		if(obj==null)
		{
			obj= new Singletone();
			return obj;
		}
		else {
			return obj;
		}
	}
	public int getVar() {
		return var;
	}
	public void setVar(int var) {
		this.var = var;
	}
	
}
