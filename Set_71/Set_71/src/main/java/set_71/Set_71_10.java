
package set_71;

public class Set_71_10 {
    public static void main(String args[])
    {
        int n=10,sum=0;
        int f1=0,f2=0,f3=1,f4;
        int sign=1;
        for(int i=1;i<=n;i++)
        {
            f4=f1+f2+f3;
            f1=f2;
            f2=f3;
            f3=f4;
            
            int x=f4;
            if(i!=1)
            {
                x=x*sign;
                sign=-sign;
            }
            System.out.println(x);
            sum=sum+x;
        }
        System.out.println("SUM="+sum);
    }
}
