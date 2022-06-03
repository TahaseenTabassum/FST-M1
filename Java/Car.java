package activities;

public class Car {
	
	String color;
	 String transmission;
	 int make;
	 int tyres;
	 int doors;
	 public Car() {
			this.tyres = 4;
			this.doors = 4;
		}
	 public void displayCharacteristics()
	 {
		 System.out.println("Color of the car "+color);
		 System.out.println("Transmission of the car "+transmission);
		 System.out.println("Make of the car "+make);
		 System.out.println("Numbers of tyres "+tyres);
		 System.out.println("Number of doors "+doors);
	 }
	 public void accelarate()
	 {
		 System.out.println("Car is moving forward.");
	 }
	 public void brake()
	 {
		 System.out.println("Car has stopped.");
	 }
}
