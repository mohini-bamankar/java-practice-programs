package set_71;

public class Set_71_5 {
    public static void main(String args[])
    {
        int n=5;
        int f1=1;int f2 = 0,f3;
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            //System.out.println(f3);
            double value=(double) (1/(Math.pow(f3,2)));
            //System.out.println(value);
            sum=sum+value;
        }
        System.out.println("SUM="+sum);
    }
}
