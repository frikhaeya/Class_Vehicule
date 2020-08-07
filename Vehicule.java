package Vehicule;

import java.util.Date;

public class Vehicule {
	
	protected String make;
	protected String model;
	protected int year;
	protected double weight;
	
	protected boolean NeedsMaintenance;
	protected double TripsSinceMaintenance;
	
	public Vehicule(String make, String model, int year, double weight) {
		this.make=make;
		this.model=model;
		this.year=year;
		this.weight=weight;
		this.NeedsMaintenance=false;
		this.TripsSinceMaintenance=0.0;
	}
	
	public String Afficher() {
		
		return ("this vehicule is a "+ this.make + " of model " + this.model + " released on " + this.year + " and weights " + this.weight + " At the moment the car had " + this.TripsSinceMaintenance + " trips since maintenance. and her need of maintenace is " + this.NeedsMaintenance );
		
	}

}
