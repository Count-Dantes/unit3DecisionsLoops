
public class ArrayMethods
{
    private int[] values;
    public ArrayMethods(int[] initialValues)
    {
        this.values = initialValues;
    }
    public String toString()
    {
        String str = "{";
            
            for( int i = 0; i < this.values.length; i++)
            {
                if( i > 0)
                {
                    str +="' ";
                }
                
                str += this.values[i];
            }
            str += "]";
            return str;
    }
    public void swapFirstAndLast()
    {
        int temp = this.values[0];
        this.values[0] = this.values[this.values.length-1];
        this.values[this.values.length-1] = temp;
    }
    public void shiftRight()
    {
        int temp = this.values[this.values.length-1];
        for(int i = this.values.length-1; i>=0; i--)
        {
            if (i != 0)
            {
                this.values[i] = this.values[i-1];
            }
        }
        this.values[0] = temp;
    }
    public void removeEven()
    {
        for(int i = 0; i<= this.values.length-1; i++)
        {
            if (this.values[i]%2 == 0)
            {
                this.values[i] = 0;
            }
        }
    }
    public void deleteMiddle()
    {
        int j = 0;
       if (this.values.length%2 == 0)
       {
           int[] tempValues = new int[this.values.length-2];
           for(int i : this.values)
           {
               if( (i != this.values[(this.values.length-1)/2] ) && 
               (i!= this.values[(this.values.length-1)/2+1]) ) 
               {
                   tempValues[j] = i;
                   j++;
               }
            }
       }
       else
       {
           int[] tempValues = new int[this.values.length-1];
           for(int i : this.values)
           {
               if (i != values[(this.values.length-1)/2] ) 
                {
                    tempValues[j] = i;
                    j++;
                }
            }
            this.values = tempValues;
        }
    }
    public void evenFront()
    {
        int[] tempValues = new int[values.length];
        int count = 0;
        for (int i = 0; i<= this.values.length-1; i++)
        {
            if (this.values[i] %2 == 0)
            {
                tempValues[count] = this.values[i];
                count +=1;
            }
        }
        for (int i = 0; i<= this.values.length-1; i++)
        {
            if (this.values[i] %2 != 0)
            {
                tempValues[count] = this.values[i];
                count +=1;            
            }
            
        }
        //this.values = te
    }
}
