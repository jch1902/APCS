
/**
 * Write a description of class AccountsTest here.
 *
 * @author (Jasper Hoong)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import chn.util.*;
public class AccountsTest
{
    private static Accounts firstAccount = new Accounts();
    private static ArrayList<Accounts> accountList = new ArrayList();
    private static double purchaseAmount;
    private static double tenderedAmount;
    private static double change;
    private static String userName;
    
    public static void run(){
        firstAccount.setName("John");
        firstAccount.setPurchase(23.06);
        firstAccount.setTenderedAmount(30.00);
        accountList.add(firstAccount);
        
        Accounts secondAccount = new Accounts();
        secondAccount.setName("Jane");
        secondAccount.setPurchase(19.99);
        secondAccount.setTenderedAmount(20.00);
        accountList.add(secondAccount);
        
        ConsoleIO newConsole = new ConsoleIO();
        Accounts customAccount = new Accounts();
        System.out.print("What's your name?");
        customAccount.setName(newConsole.readLine());
        System.out.print("How much does the item cost?");
        customAccount.setPurchase(newConsole.readDouble());
        System.out.print("How much did you pay?");
        customAccount.setTenderedAmount(newConsole.readDouble());
        accountList.add(customAccount);
        
        
        int size = accountList.size();
        int accountCount = 0;
      
        for(int i = 0;i < size;i++){
            purchaseAmount = accountList.get(accountCount).getPurchase();
            tenderedAmount = accountList.get(accountCount).getTenderedAmount();
            change = tenderedAmount - purchaseAmount;
            
            
            System.out.println(accountList.get(accountCount).getName());
            System.out.println(purchaseAmount);
            System.out.println(tenderedAmount);
            System.out.println("Change needed: " + change);
            System.out.println();
            accountCount++;
        }
        
        
    }
}
