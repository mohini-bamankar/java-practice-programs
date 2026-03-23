
package set_71;

public class Set_71_4 {
    public static void main(String args[])
    {
        int n=5;
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            double value=(double) Math.pow(2, i);
            double result=(double) (1/(Math.pow(value,2)));
            //System.out.println(value);
            //System.out.println(result);
            sum=sum+result;
        }
        System.out.println("SUM="+sum);
    }
}
