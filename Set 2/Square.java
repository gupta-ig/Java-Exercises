import java.util.Scanner;

public class Square {

    private int side;

    public Square(int side) {
        // Initialize side with the passed value
        this.side = side;
    }

    public int calculateArea() {
        // Calculate and return the area of the square
        if(side <= 0) {
            return -1;
        }
        return this.side*this.side;
    }

    public int calculatePerimeter() {
        // Calculate and return the perimeter of the square
        if(side <= 0) {
        return -1;
        }
        return 4*this.side;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        int side = sc.nextInt();

        Square sq = new Square(side);
        System.out.println("Perimeter is: " + sq.calculatePerimeter());
        System.out.println("Area is: " + sq.calculateArea());
    }

}