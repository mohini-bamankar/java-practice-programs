
package set_95_10;

public class Three extends Two
{
    protected int c;
    protected void getC(int a)
    {
        this.c=a;
    }
    
    protected int getAverage()
    {
        int avg=(a+b+c)/3;
        return avg;
    }
}
