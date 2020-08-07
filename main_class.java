package Vehicule;

public class main_class {

	public static void main(String[] args) {
		
		Cars car1 = new Cars("Mercedes","M5",2017,4500.0);
		
		Cars car2 = new Cars("Audi","A4",2015,3800.0);

		Cars car3 = new Cars("Hundai","PT",2019,2900.0);

		car1.Drive();
		car1.Stop(); 
		
		car2.Drive();
		car2.Stop(); 
		
		car1.Drive();
		car1.Stop(); 
		
		for (int i=0; i<102; i++) {
			car3.Drive();
			car3.Stop(); 
		}
		
		
		car1.Drive();
		car1.Stop(); 
		
		car2.Drive();
		car2.Stop(); 
		
		System.out.println(car1.Afficher());
		
		System.out.println(car2.Afficher());

		System.out.println(car3.Afficher());
		
		System.out.println("--------------------------------------------------");
		
		Planes plane1 = new Planes("Tuniser","A667",2000,40500.0);
		
		Planes plane2 = new Planes("AlQatriya","A400",2010,31800.0);

		Planes plane3 = new Planes("Allemanyen","P300T",1999,28900.0);

		plane1.Fly();
		plane1.Land();
		
		plane2.Fly();
		plane2.Land();
		
		plane1.Fly();
		plane1.Land();
		
		plane2.Fly();
		plane2.Land();
		
		for (int i=0; i<102; i++) {
			plane3.Fly();
			plane3.Land(); 
		}
		
		System.out.println(plane1.Afficher());
		
		System.out.println(plane2.Afficher());

		System.out.println(plane3.Afficher());
	}

}
