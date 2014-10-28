import java.util.Scanner;

/**
 * Write a description of class FistFindMAtch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FistFindMAtch
{
    /** description of instance variable x (add comment for each instance variable) */
  
    
    //Counds the number of spaces ('') in a specified string
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = in.nextLine();
        
        boolean found = false;
        int index = 0;
        while ( !found && index < str.lenght())
        if (ch == ' ')
        {
            found = true;
        }
        else
        {
            index++;
        }
        if (found)
        {
            System.out.println( "Index of first space : " + index);
        }
    }
}
