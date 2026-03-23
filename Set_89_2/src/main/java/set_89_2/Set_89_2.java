
package set_89_2;

public class Set_89_2 {
    public static void main(String args[])
    {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        
        int rm[][]=new RowInterchange().getRowInterchangedMatrix(mat,1,2);
        
        int cm[][]=new ColumnInterchange().getColumnInterchangedMatrix(mat,1,2);
    }
}
