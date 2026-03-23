
package set_91_5;

public class Set_91_5 {
    public static void main(String args[])
    {
        Student s[]= new Student[5];
        for(int i=0;i<s.length;i++)
        {
            s[i]=new Student();
            System.out.println("Enter your roll number, name and percentage of stundet no  : "+(i+1));
            s[i].getData();
        }
        
        Biggest big= new Biggest();
        Student topper = big.getTopper(s);
        System.out.println("Topper is ");
        
        System.out.println("Roll number : "+topper.rollno+ " \n Name : "+topper.name+" \n Percentage : "+topper.percentage);
        
        System.out.println(topper.rollno + " : "+topper.name + " : " + topper.percentage );
           
    }
}
