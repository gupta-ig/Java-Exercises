import java.util.Scanner;

public class WeatherAdviser {

    public String provideWeatherAdvisory(int temperature) {
        // Provide a weather advisory message based on the temperature.
        if(temperature < 0) {
            return "It's freezing! Wear a heavy coat.";
        }
        else if(temperature >= 0 && temperature <= 10) {
            return "It's cold! Bundle up.";
        }
        else if(temperature > 10 && temperature <= 20) {
            return "It's cool! A light jacket will do.";
        }
        else {
            return "It's warm! Enjoy the day.";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        int temp = sc.nextInt();

        WeatherAdviser wa = new WeatherAdviser();
        String result = wa.provideWeatherAdvisory(temp);
        System.out.println("Result is: " + result);
        sc.close();
    }
}