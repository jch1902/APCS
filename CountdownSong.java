/**
 * Basics for programming in Java
 *
 * @author (Jasper Hoong)
 * @version (a version number or a date)
 */
import chn.util.*;
public class CountdownSong extends customMessage
{ 
    public static String animalName;
    public static int countdown;
    public static void run()
    { 
      ConsoleIO newConsole = new ConsoleIO();
      System.out.println("Animal Name?");
      animalName = newConsole.readLine();
      System.out.println("How many " + animalName + "(s)" + "?");
      countdown = newConsole.readInt();
      int i = countdown;
      String space = " ";
       while (i > -1) {

           if (i == 0) { 
               System.out.println("Zero little" + space + animalName);
           } else if(i == 0){
               System.out.println(i + space + "little" + space + animalName + space + "jumping on the bed");
               System.out.println("One fell off and broke his head");
               System.out.println("Mama called the doctor and the doctor said");
               System.out.println("no more " + animalName + " jumping on the bed.");
           }else{
               System.out.println(i + space + "little" + space + animalName + "s" + space + "jumping on the bed");
               System.out.println("One fell off and broke his head");
               System.out.println("Mama called the doctor and the doctor said");
               System.out.println("no more " + animalName + "s" + " jumping on the bed.");
           }
           
           i--; 
       }
    }
}
class customMessage{//TODO
    public static String animalName;
    public static int countdown;
    public static void main(String[] args)
    { 
      ConsoleIO newConsole = new ConsoleIO();
      System.out.println("Animal Name?");
      animalName = newConsole.readLine();
      System.out.println("How many " + animalName + "(s)" + "?");
      countdown = newConsole.readInt();
    }
    public String toString(){
        return "left on the bed";
    }
}