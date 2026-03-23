
package set_89_4;

public class PrimeArray {
    int a[];  // Data member of class
    int [] getPrimeArray()
    {
        int count=0;
        boolean flag=true;
        
        for(int i=2;i<a.length;i++)
        {
            count++;
            if(a[i]%i==0)
            {
                flag=false;
                break;
            }
        }
        int pa[]=new int[count];
        int p=0;
        for(int i=0;i<a.length;i++)
        {
            if(flag==true)
            {
                pa[p++]=a[i];
            }
        }
        return pa;
       
        /*
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
        return ea;*/
    }
}
