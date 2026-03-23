
package average;

public class Matrix {
    public double getMatrixAv(int mat[][])
    {
       int sum=0;
       for(int i=0;i<mat.length;i++)
       {
           for(int j=0;j<mat[0].length;j++)
           {
               sum=sum+mat[i][j];
           }
       }
       double avg=(double)sum/(mat.length*mat[0].length);
       return avg;
    }
}
