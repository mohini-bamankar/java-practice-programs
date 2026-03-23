
package arithmatic_op;

public class Arithmatic_op {
    public static void main(String args[])
    {
        System.out.println("Addition = "+new Addition().getAddition(34, 56));
        System.out.println("Difference = "+new Difference().getDifference(75, 32));
        System.out.println("Multiplication = "+new Multiplication().getProduct(32, 2));
        System.out.println("Division = "+new Division().getDivision(46, 2));
        System.out.println("Reminder = "+new Reminder().getReminder(35, 4));
    }
}
