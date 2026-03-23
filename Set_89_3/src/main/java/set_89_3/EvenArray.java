
package set_89_3;

public class EvenArray {
    int a[];  // Data member of class
    int [] getEvenArray()
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                count++;
            }
        }
        int ea[]=new int[count];
        int p=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                ea[p++]=a[i];
            }
        }
        return ea;
    }
    
    
}
