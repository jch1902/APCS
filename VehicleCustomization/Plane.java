    
/**
 * Write a description of class Plane here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Plane extends VehicleCustomizer implements Diagnostics
{
   private int seats;
   private int topSpeed;
    public Plane(String vendor, String model, int seats, int topSpeed){
       super(vendor,model);
       this.seats = seats;
       this.topSpeed = topSpeed;
   }
   public int getSeats(){
       return seats;
   }
   public int gettopSpeed(){
       return topSpeed;
   }
   public String toString(){
        return (vendor + " " + model + " \nTop Speed: " + 
        topSpeed + " knots \nSeats: " + seats + "\n");
   }
   @Override
   public void runDiagnostics() {
        System.out.println(this.toString());
   }
}
