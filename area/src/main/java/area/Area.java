
package area;

public class Area {
    public static void main(String args[])
    {
        System.out.println("Area of Triangle ="+ new Triangle().getArea(34, 23));
        System.out.println("Area of Circle ="+ new Circle().getArea(22));
        System.out.println("Area of Rectangle ="+ new Rectangle().getArea(56, 3));
        System.out.println("Area of Square ="+ new Square().getArea(45));
    }
}
