
package set_72;

public class Set_72_7 {
    public static void main(String args[])
    {
        int a=12,b=21;
        int rem=a%b;
        
        while(rem!=0)
        {
            a=b;
            b=rem;
            rem=a%b;
        }
        System.out.println("GCD="+b);
    }
}
