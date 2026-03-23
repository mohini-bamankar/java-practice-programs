
package set_71;

public class Set_71_7 {
    public static void main(String args[])
    {
        int n=5,sign=1;
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            double value=(double)1/i;
            //System.out.println(value);
            value=value*sign;
            sign=-sign;
            sum=sum+value;
            //System.out.println(value);
        }
        System.out.println("SUM="+sum);
    }
}
