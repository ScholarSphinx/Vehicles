package vehicles;

public class Vehicle {

	protected String make;
	protected String model;
	protected String year;
	protected int value;
	protected int VMax;
	
	
	//Constructors 
	public Vehicle() {
		make = "Make 0"; // do i add the this.
		model = "Model 0";
		year = "Year 0";
		value = 0;
		VMax= 0;
	}
	public Vehicle(String make,String model,String year,int value,int VMax) {
		this.make = make;
		this.model = model;
		this.year = year ;
		this.value = value;
		this.VMax = VMax;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getVMax() {
		return VMax;
	}
	public void setVMax(int VMax) {
		this.VMax = VMax;
	}
	
	public String toString() {
		return "Make: " + this.make + " Model: " + this.model +" Year: " + this.year + " Value: " + this.value
				+ " Max Speed: " + this.VMax;
	}
	
	public void depreciate() {
		value = value*(5/100);
		
	}

}
