import java.util.Scanner;

public class FindMax
{
    //finds jesus
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println( "Enter a serises of numbers (type 'q' to quit)");
        double maxValue = in.nextDouble();
    
        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            if (value > maxValue)
            {
                maxValue = value;
            }
        
        }
        
        System.out.println("maximum value: " + maxValue);
    }
    
}