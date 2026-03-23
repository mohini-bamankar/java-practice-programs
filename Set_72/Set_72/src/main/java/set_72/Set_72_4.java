
package set_72;

public class Set_72_4 {
    public static void main(String args[])
    {
        long pop=12500000;
        double ROG=2.5, ROD=1.2;
        int Noy=10,count=1;
        
        System.out.println("Original population is "+pop);
        
        while(count<=Noy)
        {
            long one_pc=(long)pop/100;
            long per_year_growth=(long)((long)one_pc*ROG);
            long per_year_death=(long) ((long)one_pc*ROD);
            
            pop = pop + per_year_growth - per_year_death;
            
            System.out.println("YEAR : "+count+" : "+pop);
            count++;
        }
    }
}
