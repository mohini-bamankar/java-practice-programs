
package set_71;

public class Set_71_8 {
    public static void main(String args[])
    {
        int n=5,sign=1;
        double sum=0,value=0;
        for(int i=1;i<=n;i++)
        {
            //int x=1;
            value=(double) (value+i);
            double result = (double) 1/value;
            result=result*sign;
            sign=-sign;
            //System.out.println(value);
            //System.out.println(result);
            sum=sum+result;
        }
        System.out.println("SUM="+sum);
    }
}
