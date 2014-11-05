import java.util.Scanner;
public class Fibonacci
{
    
    public static void main()
    {
        System.out.print("n = : ");
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long fold1 = 1;
        long fold2 = 0;
        long fnew = 0;
        for(int i=1; i<=n; i++)
        {
            fnew = fold1+fold2;
            fold1 = fold2;
            fold2 = fnew;
            System.out.println("\t\t" + i);
        }
        
        System.out.println("the " + n + "th fibonacci number is " + fnew); 
    }

}
