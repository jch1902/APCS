
/**
 * Write a description of class MainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
public class MainClass
{
    private static String answer;
    private static String className;
    private static boolean runClass = true;
    private static ConsoleIO newConsole = new ConsoleIO();
    public static void main(String[]args){
        
        
        while(runClass == true){
            System.out.println("Which class would you like to run?");
            className = newConsole.readLine();
            switch(className){
                case "DrawHouse":
                    DrawHouse.run();
                    afterRan();
                break;
                
                case "Countdown Song":
                    CountdownSong.run();
                    afterRan();
                break;
                
                case "sphero":
                    sphero.run();
                    afterRan();
                break;
                
                case "Rectangle":
                    Rectangle.run();
                    afterRan();
                break;
                
                case "AccountsTest":
                    AccountsTest.run();
                    afterRan();
                break;
                
                case "Start":
                    Start.run();
                    afterRan();
                break;
                
                case "test":
                    test.run();
                    afterRan();
                break;
                
                case "VehicleCustomizerTest":
                    VehicleCustomizerTest.run();
                    afterRan();
               break;
                
               case "TestingMain":
                    TestingMain.run();
                    afterRan();
               break;
               default:
                    System.out.println("Please type in the class name correctly(case sensitive)");
               break;
            }
        }  
    }
    public static void afterRan(){
        System.out.print("Would you like to run another program?(Y/N)");
        answer = newConsole.readLine();
        if(answer.equals("Y")){
           runClass = true;
           System.out.println(runClass);
        }else{
           runClass = false;
           System.out.println(runClass);
        }
        System.out.println();
    }
}
