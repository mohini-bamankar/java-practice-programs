
package set_89_2;

public class RowInterchange {
    
    int [][] getRowInterchangedMatrix(int mat[][],int r1,int r2)
    {
        
                         
                         if((r1>=1 && r1<=mat.length) && (r2>=1 & r2<=mat.length))
                         {
                             r1=r1-1;
                             r2=r2-1;
                             for(int j=0;j<mat[0].length;j++)
                             {
                                 int temp=mat[r1][j];
                                 mat[r1][j]=mat[r2][j];
                                 mat[r2][j]=temp;
                             }
                             System.out.println("Rows are exchanged successfully.");
                         }
                         else
                         {
                             System.out.println("Rows are out of range.");
                         }
        
        return mat;
    }
}
