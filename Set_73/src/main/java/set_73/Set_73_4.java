
package set_73;

public class Set_73_4 {
    public static void main(String args[])
    {
        int i=1, num=5,fact=1;
        double sum=0;
       
        while(i<=num)
        {
            fact=fact*i;
            double value = (double) i/fact;
            sum=sum+value;
            i++;
            //System.out.println(fact);
            //System.out.println(value);
        }
        System.out.println("SUM = "+sum);
    }
}
