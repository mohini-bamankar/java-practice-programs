
package set_91_6;

public class BigSmall {
    void BigSmall(int a[])
    {
        int big=a[0];
        int small=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>big)
                big=a[i];
            
            if(a[i]<small)
                small=a[i];
        }
        System.out.println("Big = "+big);
        System.out.println("Small = "+small);
    }
}
