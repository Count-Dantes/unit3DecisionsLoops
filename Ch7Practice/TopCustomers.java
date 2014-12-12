import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class TopCustomers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopCustomers
{
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<Double> sales = new ArrayList<Double>();
    
    public void addSale(String customerName, double amount)
    {
        this.names.add(customerName);
        this.sales.add(amount);
    }
    
    public void main()
    {
        Scanner in = new Scanner(System.in);
        int end = 0;
        while (end == 0)
        {
            System.out.print("What is the name?\t:");
            this.names.add(in.next());
            System.out.print("How much dey pay?\t:");
            this.sales.add(in.nextDouble());
            System.out.println("n to quit");
            //System.out.println(in.next());
            if( in.next() == "n")
            {
                end = 1;
                System.out.println("ended");
            }
        }
        double highCost = 0;
        int highIndex = 0;
        for(int i = 0; i< this.sales.size()-1; i++)
        {
            if (this.sales.get(i) > highCost)
            {
                highCost = this.sales.get(i);
                highIndex = i;
            }
        }
        System.out.println(names.get(highIndex) + " bought the most useless shit for $" 
                            + sales.get(highIndex));
                 
        
    }

}
