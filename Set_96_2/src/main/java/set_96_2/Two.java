
package set_96_2;

public class Two extends One
{
    private int b;
    private void getB(int x)
    {
        b=x;
    }
    public void callgetB(int x)
    {
        getB(x);
    }
    public int returnB()
    {
        return b;
    }
}
