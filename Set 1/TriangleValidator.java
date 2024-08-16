public class TriangleValidator {
    public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // write your code here
        if(angle1 > 0 && angle2 > 0 && angle3 > 0)
        {
            if(angle1 + angle2 + angle3 == 180)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        TriangleValidator tri = new TriangleValidator();
        if(isValidTriangle(45, 45, 90)) {
            System.out.println("Triangle is valid");
        }
        else {
            System.out.println("Triangle is not valid");
        }   
    }
    @Override
    public String toString() {
        return "TriangleValidator []";
    }
}