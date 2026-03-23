
package set_68;

public class Set_68_7 {
    public static void main(String args[])
    {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int sp=1;sp<i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
