
package set_91_5;

public class Biggest {
    Student getTopper(Student s[])
    {
        Student topper = new Student();
        topper.percentage = s[0].percentage;
        
        for(int i=0;i<s.length;i++)
        {
            if(s[i].percentage > topper.percentage)
            {
                topper.percentage = s[i].percentage;
                topper = s[i];
            }
        }
        return topper;
    }
}
