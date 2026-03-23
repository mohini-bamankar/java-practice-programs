
package set_73;

public class Set_73_5 {
    public static void main(String args[])
    {
        int i=1,num=5;
        double sum=0;
        
        while(i<=num)
        {
            double value = (double) i/(i*i);
            sum=sum+value;
            //System.out.println(value);
            i++;
        }
        System.out.println("SUM="+sum);
    }
}
