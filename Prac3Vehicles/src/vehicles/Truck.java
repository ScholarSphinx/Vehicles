package vehicles;

public class Truck extends Vehicle {
	
	private int cargo;
	
	public Truck() {
		super();
		this.cargo = 1;	
	}
	public Truck(String make , String model, String year , int value , int VMAx , int cargo) {
		super(make,model,year,value,VMAx);
		this.cargo = cargo;
	}
	
	public void depreciate(int cargo) {
		value = value - cargo*(1/100);
		
	}
	
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	public double getCargo() {
		return cargo;
	}
	public String toString() {
		return super.toString() + "Cargo" + this.cargo;
	}
	
}	

