package activites;

interface BycycleParts {
	public int gears = 0, speed = 0;

}

interface BycycleOperations {
	void applyBrake(int decrement);

	void sppedUp(int increment);

}

class Bicycle implements BycycleParts, BycycleOperations {
	public int gears,speed;
	public Bicycle (int gears,int speed) {
		this.gears=gears;
		this.speed=speed;
		

	}

	public void applyBrake(int decrement) {
		int decSpeed = speed - decrement;
		System.out.println("decSpeed=" + decSpeed);
	}

	public void sppedUp(int increment) {
		int inSpeed = speed + increment;
		System.out.println("inSpeed=" + inSpeed);
	}

	public String bycycleDesc() {
		return ("no of gares are" + gears + "\n speed of bycycle is" + speed);
	}

}

class MountainBike extends Bicycle {
	
	public int seatHeight;
	public MountainBike(int gears,int speed,int seatHeight)
	{
	super(gears,speed);
	this.seatHeight=seatHeight;
		
		
	}
	public void setHeight(int newValue)
	{
		seatHeight=newValue;
	}
	
	
	public String bycycleDesc() {
		return (super.bycycleDesc()+"\n seatHeight="+seatHeight);
	}
}

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb=new MountainBike(10,5,25);
		System.out.println(mb.bycycleDesc());
		mb.sppedUp(500);
		mb.applyBrake(500);
		
	}

}
