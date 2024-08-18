package vehicles;

public class Car extends Vehicle {
	
	private int seats;
	private int doors;
	
	public Car() {
		super();
		this.seats = 1;
		this.doors = 1;
	}
	public Car(String make , String model, String year , int value , int VMAx,int seats , int doors) {
		super(make,model,year ,value ,150); //super(make;model;type;year
		this.seats = seats;
		this.doors = doors;
	}
	public void depreciate(){
		value = value - value *(15/100);
	}
	
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getSeats() {
		return seats;
	}
	
	public void setDoors (int doors) {
		this.doors = doors;
	}
	public int getDoors() {
		return doors;
	}
	public String toString() {
		return super.toString()+ " Seats: " + this.seats + " Doors: " + this.doors;
	}
}
