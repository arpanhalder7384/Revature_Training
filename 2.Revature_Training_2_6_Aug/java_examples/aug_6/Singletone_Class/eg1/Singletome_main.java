package eg1;

public class Singletome_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singletone sn1=Singletone.getSingletoneInstance();
		Singletone sn2=Singletone.getSingletoneInstance();
		sn1.setVar(10);	
		System.out.println(sn1.getVar());
		System.out.println(sn2.getVar());
		sn2.setVar(20);
		System.out.println(sn1.getVar());
		System.out.println(sn2.getVar());
	}

}
