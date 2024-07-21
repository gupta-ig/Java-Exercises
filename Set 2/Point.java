// Defining a Point class to represent a point in 2-dimensional space

import java.util.Scanner;

public class Point {
    
    // x-coordinate of the point
    private int x;

    // y-coordinate of the point
    private int y;

    // Constructor for the Point class
    public Point(int x, int y) {
        this.x = x;  // Assigning x-coordinate of the point
        this.y = y;  // Assigning y-coordinate of the point
    }

    // Method to get the x-coordinate of the point
    public int getX() {
        return x;
    }

    // Method to get the y-coordinate of the point
    public int getY() {
        return y;
    }

    // Implement the method to move the point by dx and dy in x and y direction respectively
    public void move(int dx, int dy) {
        // Your code here
        this.x += dx;
        this.y += dy;
    }

    // Implement the method to calculate the distance from this point to another point
    public double distanceTo(Point other) {
        int diffX = this.x - other.x;
        int diffY = this.y - other.y;
        return Math.sqrt(diffX*diffX + diffY*diffY);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int y = obj.nextInt();
        
        Point obj1 = new Point(x, y);
        Point obj2 = new Point(x, y);
        System.out.println("Enter displacement: ");
        int dx = obj.nextInt();
        int dy = obj.nextInt();
        obj2.move(dx, dy);
        System.out.println("Coordinate of  first point: " + obj1.getX() + "," + obj1.getY());
        System.out.println("Coordinate of  first point after displacement: " + obj2.getX() + "," + obj2.getY());
        System.out.println("Distance between the points: " + obj1.distanceTo(obj2));
        obj.close();
    }
}