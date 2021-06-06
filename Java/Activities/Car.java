package activites;

public class Car {
	String color,transmission;
	int make,doors,tyres;
	Car()
	{
		tyres=4;
		doors=4;
	}
	public void displayCharacterstics()
	{
		System.out.println("tyres="+tyres);
		System.out.println("doors="+doors);
		System.out.println("make="+make);
		System.out.println("Color="+color);
		System.out.println("transmission="+transmission);
	}
	
	public void accelarate()
	{
		System.out.println("car is moving forward");
	}
	public void brake()
	{
		System.out.println("car has stopped");
	}

}
