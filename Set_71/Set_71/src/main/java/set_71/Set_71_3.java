
package set_71;

public class Set_71_3 {
    public static void main(String args[])
    {
        int n=5;int sum = 0;
        for(int i=1;i<=n;i++)
        {
            int factorial=1;
            for(int j=1;j<=i;j++)
            {
                factorial=factorial*j;
            }
            sum=sum+factorial;
        }
        System.out.println("SUM="+sum);
        
    }
}
