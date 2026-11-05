import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double convertCelsius = InputHelper.getDouble(scan, "Enter a temperature in Celsius: ");
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println("Your temperature in degrees Fahrenheit is: " + fahrenheit);
        return fahrenheit;
    }
}
