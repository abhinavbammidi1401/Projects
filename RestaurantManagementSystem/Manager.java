/*
Version - 1.0.0 Date - 14-01-2024
Author - Abhinav Bammidi
*/

public class Manager extends Staff
{
    private static final double MINIMUM_RATE = 100.0;
    
    public Manager()
    {
        super();
    }
    public Manager( int newID, String newLastName, String newFirstName, String newPassward)
    {
        super(newID, newLastName, newFirstName, newPassward);
        wageRate = MINIMUM_RATE;
    }
    
    public void setWageRate(double newRate)
    {
        if(wageRate < MINIMUM_RATE)
            newRate = MINIMUM_RATE;
        wageRate = newRate;
    }
    

    public double culculateWages()
    {
        if(getWorkState() != WORKSTATE_FINISH)
            return 0;
        
        return this.wageRate;
    }
}
