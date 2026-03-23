
package set_88_3;

public class Reverse {
    int num;
    
    int getReverse()
    {
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
}
