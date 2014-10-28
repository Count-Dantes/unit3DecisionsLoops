import java.util.Scanner;

public class CompareAdjacent
{
    //is like a dawg, yo
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a serises of numbers (type 'q' to quit)");
        
        double preValue = in.nextDouble();
        
        while (in.hasNextDouble() )
        {
            double value = in.nextDouble();
            if (value == preValue)
            {
                System.out.println("duplicate number!");
            }
            
            preValue = value;
        }
    }
}
            
        