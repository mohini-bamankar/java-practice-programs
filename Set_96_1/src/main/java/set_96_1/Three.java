
package set_96_1;

public class Three extends Two
{
    private int c;
    private void getC(int x)
    {
        c=x;
    }
    public void callgetC(int x)
    {
        getC(x);
    }
    public int returnC()
    {
        return c;
    }
}
