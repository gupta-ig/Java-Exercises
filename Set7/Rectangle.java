class Rectangle extends Shape {
    private double length;
    private double width;
    
    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea() {
        return length*width;
    }
}