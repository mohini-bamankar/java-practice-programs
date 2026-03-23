
package set_73;

public class Set_73_3 {
    public static void main(String args[])
    {
        int num=5,i=1;
        double sum=0;
        
        while(i<=num)
        {
            double value=(double)1/i;
            sum=sum+value;
            i++;
        }
        System.out.println("SUM="+sum);
    }
}

