
package set_88_4;

public class Prime {
    int num;
    
    boolean isPrime()
    {
        boolean flag = true;
        for(int i=0;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
}
