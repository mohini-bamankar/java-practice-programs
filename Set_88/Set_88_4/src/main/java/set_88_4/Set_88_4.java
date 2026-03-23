
package set_88_4;

public class Set_88_4 {
    public static void main(String args[])
    {
        Prime p=new Prime();
        p.num=53;
        
        if(p.isPrime())
            System.out.println(p.num +" is a prime number");
        else
            System.out.println(p.num + " is not a prime number");
    }
}
