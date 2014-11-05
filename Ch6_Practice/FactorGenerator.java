public class FactorGenerator
{
   
    public void FactorGenerator(int numberToFactor)
    {
        int NUMBER = numberToFactor;
    }

   
    public int nextFactor(int lastFactor)
    {
        for (lastFactor; lastFactor < NUMBER; lastFactor++)
        {
            if (NUMBER % lastFactor == 0)
            {
                return lastFactor;
            }
            else
            {
                lastFactor+=1
            }
        }
                
    }
    
    public boolean hasMoreFactors(int lastFactor)
    {
        for (lastFactor; lastFactor < NUMBER; lastFactor++)
        {
            if ( (NUMBER % lastFactor == 0) && (lastFactor != NUMBER)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
                
    }

}
