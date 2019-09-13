
/**
 * Write a description of class Start here.
 *
 * @author (Jasper Hoong)
 * @version (a version number or a date)
 */
public class Start
{

    private int errorCode;

    public Start()
    {
        errorCode = 0;
    }
    public static void run(){
        System.out.println("\u000c\nHello, World! In main");
        
        FirstClass first = new FirstClass();
        first.setQuestion("hi");
        System.out.println(first.askQuestion());
        
        SecondClass second = new SecondClass();
        second.setQuestion("hello");
        System.out.println(second.askQuestion());
        
    }
}
