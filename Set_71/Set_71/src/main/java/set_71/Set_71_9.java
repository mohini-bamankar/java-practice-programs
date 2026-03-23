
package set_71;

public class Set_71_9 {
    public static void main(String args[])
    {
        int n=5,sign=1;
        int f1=0,f2=1,f3;
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            double value=(double)2/f3;
            value=value*sign;
            sign=-sign;
            //System.out.println(f3);\
            sum=sum+value;
            System.out.println(value);
        }
        System.out.println("SUM="+sum);
    }
}
