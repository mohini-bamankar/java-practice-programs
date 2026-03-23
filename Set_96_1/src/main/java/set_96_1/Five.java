
package set_96_1;

public class Five extends Four
{
    private int e;
    private void getE(int x)
    {
        e=x;
    }
    public void callgetE(int x)
    {
        getE(x);
    }
    public int returnE()
    {
        return e;
    }
    
    int [] getArray()
    {
        int a[]={returnA(),returnB(),returnC(),returnD(),returnE()};
        return a;
    }
    public int getCount(int a[])
    {
        int p_count=0,n_count=0,z_count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                p_count++;
            }
            else if(a[i]<0)
            {
                n_count++;
            }
            else
            {
                z_count++;
            }
        }
        return p_count;
    }
}
