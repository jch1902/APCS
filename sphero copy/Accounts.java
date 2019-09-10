
/**
 * Write a description of class Accounts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Accounts
{
   private String name;
   public void setName(String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }
   
   private double purchase;
   public void setPurchase(double purchase){
       this.purchase = purchase;
   }
   public double getPurchase(){
       return purchase;
   }
   
   private double tendered;
   public void setTenderedAmount(double tendered){
       this.tendered = tendered;
   }
   public double getTenderedAmount(){
       return tendered;
   }
  
}
