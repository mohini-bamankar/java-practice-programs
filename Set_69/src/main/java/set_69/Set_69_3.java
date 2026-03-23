
package set_69;

public class Set_69_3 {
    public static void main(String args[])
    {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int sp=(n-i);sp>0;sp--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
