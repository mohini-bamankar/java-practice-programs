
package set_96_2;

public class Four extends Three
{
    private int d;
    private void getD(int x)
    {
        d=x;
    }
    public void callgetD(int x)
    {
        getD(x);
    }
    public int returnD()
    {
        return d;
    }
}
