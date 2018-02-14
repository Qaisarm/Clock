
/**
 * A class for ClockDisplay test.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testClockDisplay
{
   
    /**
     * Constructor for objects of class testClockDisplay
     */
    public testClockDisplay()
    {  
    }

    
    public void test()
    {
        ClockDisplay clock = new ClockDisplay();
        
        clock.setTime (22, 30);
        System.out.println(clock.getTime());
        clock.setTime (12, 30);
        System.out.println(clock.getTime());
        
    }
}
