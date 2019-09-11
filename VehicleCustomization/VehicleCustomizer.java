
/**
 * Write a description of class VehicleCustomizer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class VehicleCustomizer 
{
    protected String vendor;
    protected String model;
    public VehicleCustomizer(String vendor, String model){
        this.vendor = vendor;
        this.model = model;
        
    }
    public String getVendor(){
        return vendor;
    }
    public String getModel(){
        return model;
    }
    public String toString(){
        return (vendor + " " + model);
    }
}
