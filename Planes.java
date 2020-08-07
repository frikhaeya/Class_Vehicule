package Vehicule;

public class Planes extends Vehicule{
	
	private boolean isFlying;
	
	private boolean AttemptToFlight;
	
	public Planes(String make, String model, int year, double weight) {
		super(make, model, year, weight);
		this.isFlying=false;
		this.AttemptToFlight=true;
	}
	
	public void Fly(){
		this.isFlying=true;
	}
	
	public void Land(){
		this.isFlying=false;
		this.TripsSinceMaintenance +=1;
		if (TripsSinceMaintenance==100) {
			this.NeedsMaintenance=true;
			this.AttemptToFlight=false;
			System.out.println("the plane can't fly until it's repaired.");
		}
	}
	

}
