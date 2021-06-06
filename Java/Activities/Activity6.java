package activites;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

class plane
{
	public List<String> Passengers;
	public int maxPaassengers;
	public Date lastTimeTookOf;
	public Date lastTimeLanded;
	
	 public plane(int maxPassengers) {
	        this.maxPaassengers = maxPassengers;
	        this.Passengers = new ArrayList<>();
	    }

	    public void onboard(String passenger) {
	        this.Passengers.add(passenger);
	    }

	    public Date takeOff() {
	        this.lastTimeTookOf = new Date();
	        return lastTimeTookOf;
	    }

	    public void land() {
	        this.lastTimeLanded = new Date();
	        this.Passengers.clear();
	    }

	    public Date getLastTimeLanded() {
	        return lastTimeLanded;
	    }

	    public List<String> getPassengers() {
	        return Passengers;
	    }
	}


public class Activity6 {

	public static void main(String[] args) throws ParseException, InterruptedException {
		// TODO Auto-generated method stub
		
		   //There is a plane with max 10 passengers
		plane plane = new plane(10);
        //Add passengers on the list
        plane.onboard("John");
        plane.onboard("Steve");
        plane.onboard("Anna");
        //Plane takes off
        System.out.println("Plane took off at: " + plane.takeOff());
        //Print list of people on board
        System.out.println("People on the plane: " + plane.getPassengers());
        //Flying.....
        Thread.sleep(5000);
        //Plane has landed
        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
	}

}
