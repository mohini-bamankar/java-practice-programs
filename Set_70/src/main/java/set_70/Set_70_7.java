
package set_70;

public class Set_70_7 {
    public static void main(String args[])
    {
        int x=1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int value=(int) Math.pow(2, x++);
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
