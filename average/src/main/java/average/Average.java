
package average;

public class Average {
    public static void main(String args[])
    {
        int a[]= {1,2,3,4,5};
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Average of Array elements = "+ new Array().getArrayAv(a));
        System.out.println("Average of Matrix elements = "+ new Matrix().getMatrixAv(mat));
    }
}
