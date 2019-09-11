
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends VehicleCustomizer implements Diagnostics
{
   private int topSpeed;
   private int trunkSize;
   private String carType;
   public Car(String vendor, String model, String carType, int topSpeed, int trunkSize){
       super(vendor,model);
       this.topSpeed = topSpeed;
       this.carType = carType;
       this.trunkSize = trunkSize;
   }
   public int gettopSpeed(){
       return topSpeed;
   }
   public int gettrunkSize(){
       return trunkSize;
   }  
   public String getcarType(){
       return carType;
   }
   public String toString(){
        return (vendor + " " + model + " " + carType 
        + " \nTop Speed: " + topSpeed + " \nTrunk size: " + trunkSize + "\n");
   }
   @Override
   public void runDiagnostics() {
        System.out.println(this.toString());
   }
}
