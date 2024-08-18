package vehicles;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Database data = new Database();
    
    ArrayList<String> vehicles = new ArrayList<String>();
    
    String V1 = "Ford Mustang";
    String V2 = "Mclaren P1";
    String V3 = "Mercedez Bens AMG";
    String V4 = "Big Truck";
    String V5 = "Polo GTI";
    
    Vehicle car1 = new Car(V1,"Chevy" , "2012", 500000, 150 , 4 , 4);
    Vehicle truck1 = new Truck (V4 ,"Mercedez" , "2010", 1000000,100 , 150);
    vehicles.add(V1);
    vehicles.add(V2);
    vehicles.add(V3);
    vehicles.add(V4);
    vehicles.add(V5);
    
    System.out.println(vehicles + "\n");
    System.out.println(car1);
    System.out.println(truck1);
    
    
    }
}
