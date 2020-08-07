package Vehicule;

public class Cars extends Vehicule{
	
	private boolean isDriving;
	
	public Cars(String make, String model, int year, double weight) {
		super(make, model, year, weight);
		this.isDriving=false;
	}
	
	public void Drive(){
		this.isDriving=true;
	}
	
	public void Stop(){
		this.isDriving=false;
		this.TripsSinceMaintenance +=1;
		if (TripsSinceMaintenance==100) {
			this.NeedsMaintenance=true;
		}
	}
	
	public void Repair() {
		this.TripsSinceMaintenance=0.0;
		this.NeedsMaintenance=false;
	}
	
	
}
