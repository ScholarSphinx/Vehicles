package vehicles;
import java.util.ArrayList;
public class Database {
	
	private ArrayList <Vehicle> vehicles = new ArrayList <Vehicle>();
	
	public Database() {
		vehicles = new ArrayList <>();
	}
	public Database(int size) {
		vehicles = new ArrayList<>(size);
	}
	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}
	public int getSize() {
		return vehicles.size();
	}
	public void addVehicle(Vehicle vehicle){ //object vehicle
		 vehicles.add(vehicle);
	}
	public void displayVehicles() {
		for(int i = 0 ; i< vehicles.size() ; i++) {
			System.out.println(vehicles.get(i));
		}
	}
	public void depreciation(Vehicle vehicle) {
		 for(int i = 0 ; i <vehicles.size() ; i++) {
			 vehicle.depreciate();
		 }
	}
}
