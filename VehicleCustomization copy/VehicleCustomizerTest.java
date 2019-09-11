
/**
 * Write a description of class CarCustomizerTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class VehicleCustomizerTest
{
    private static ArrayList<Diagnostics> vehicleList = new ArrayList<Diagnostics>();
    public static void main(String[]args){
        Car newCar1 = new Car("BMW","3 Series","Luxury Sedan",320,17);
        vehicleList.add(newCar1);
        
        Plane newPlane1 = new Plane("Beechcraft","Super 3 Musketeer",4,137);
        vehicleList.add(newPlane1);
        
        
        for(Diagnostics run : vehicleList) {
            run.runDiagnostics();
	}
    }
}
