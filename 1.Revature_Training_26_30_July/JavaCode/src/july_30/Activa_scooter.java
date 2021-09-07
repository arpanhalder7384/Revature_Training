package july_30;

public class Activa_scooter implements GearlessScooter, AutoStartable{
	private int speed=0; 
	private boolean started=false;
	public void pressStartButton() {
		speed=0;
		this.started=true;
		System.out.println("!!!Scooter Started!!!\t\tCurrent Speed is: " +speed);
	}
	
	public void acclerate()
	{
		speed=speed+5;
		System.out.println("Acclerating Speed !! Current Speed is: " +speed);
	}
	
	public void applyBrake()
	{
		speed=speed-5;
		System.out.println("Applying Brake !! Current Speed is: " +speed);
	}
	public void displaySpeed()
	{
		System.out.println("Current Speed is: " +speed);
	}
	public static void main(String[] args) {
		Activa_scooter as1=new Activa_scooter();
		as1.pressStartButton();
		as1.acclerate();
		as1.acclerate();
		as1.acclerate();
		as1.applyBrake();
		as1.applyBrake();
	}

}
