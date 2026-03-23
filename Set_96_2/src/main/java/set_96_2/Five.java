
package set_96_2;

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
}
