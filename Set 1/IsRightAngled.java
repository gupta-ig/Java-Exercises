public class IsRightAngled {
    public static boolean isRightAngle(int side1, int side2, int side3) {
        // write your code
        if(side1 < 0 || side2 < 0 || side3 < 0)
        {
            return false;
        }
        if( side1*side1 == (side2*side2 + side3*side3))
        {
            return true;
        }
        if( side2*side2 == (side1*side1 + side3*side3))
        {
            return true;
        }
        if( side3*side3 == (side2*side2 + side1*side1))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        IsRightAngled ra = new IsRightAngled();
        if(isRightAngle(23, 45, 67)) {
            System.out.println("Triangle is right angled");
        }
        else { 
            System.out.println("Triangle is not right angled");
        }

    }
}