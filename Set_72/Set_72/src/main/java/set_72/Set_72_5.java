
package set_72;

public class Set_72_5 {
    public static void main(String args[])
    {
        double  PA=1000;
        double ROI=10;
        double DPA=2*PA;
        
        System.out.println("The principle amount kept in bank "+PA);
        int count=1;
        
        while(PA<=DPA)
        {
            double py_PA = (PA/100)*ROI;
            PA=PA+py_PA;
            System.out.println("The principle amount at the end of year "+count+" is "+PA);
            count++;
        }
    }
}
