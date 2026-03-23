
package set_88_2;

public class Average {
    int a,b,c;
    double sum,avg;
    
    void getData(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    
    void findAverage()
    {
        sum=a+b+c;
        avg=sum/3;
    }
    
    void getAverage()
    {
        System.out.println("Average = "+avg);
    }
}
