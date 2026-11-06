import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double convertCelsius = InputHelper.getDouble(scan, "Enter a temperature in Celsius: ");
        double fahrenheit = celsiusToFahrenheit(convertCelsius);

        System.out.printf("Your temperature in degrees Fahrenheit is %.2f\n", fahrenheit);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}