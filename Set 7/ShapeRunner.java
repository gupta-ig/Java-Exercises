import java.util.Scanner;

public class ShapeRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();
        Circle objCircle = new Circle(null, radius);
        System.out.println("Area of the circle: " + objCircle.calculateArea());

        System.out.print("Enter length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        int breadth = sc.nextInt();
        Rectangle objRectangle = new Rectangle(null, length, breadth);
        System.out.println("Area of reactangle: " + objRectangle.calculateArea());

        sc.close();
    }
}
