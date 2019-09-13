
/**
 * Write a description of class Counting here.
 *
 * @author (Jasper Hoong)
 * @version (a version number or a date)
 */
public class Counting
{
    private Boolean operations;
    public void updateCounters(Boolean operations){
        this.operations = operations;
    }
    public Boolean printCounters(){
        return operations;
    }
}
