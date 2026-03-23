
package set_71;

public class Set_71_1 {
    public static void main(String args[])
    {
        int n=10;
        double sum=0;
        for(int i=2;i<=n;i+=2)
        {
            //int x=2;
            double value = (double)(Math.pow(i, 2));
            double result=(double)(1/value);
            //System.out.println(result);
            sum=sum+result;
        }
        System.out.println("SUM="+sum);
    }
}
