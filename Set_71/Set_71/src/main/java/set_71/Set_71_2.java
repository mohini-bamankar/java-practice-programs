
package set_71;

public class Set_71_2 {
    public static void main(String args[])
    {
        int n=5;double sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum=(sum+Math.pow(3, i));
        }
        System.out.println("SUM="+sum);
    }
}
