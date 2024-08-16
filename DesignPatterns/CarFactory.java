package DesignPatterns;

public class CarFactory {
    public static Car getCar(String type) {
        switch (type.toLowerCase()) {
            case "sedan":
                return new Sedan();
            case "suv":
                return new SUV();
            case "truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown car type");
        }
    }
}