package converters;
import java.util.Scanner;

public class TemperatureConverter {
    public static void convert(Scanner scanner) {

        //User is shown the options for temperature.
        System.out.println("\nTemperature Conversion");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.print("Choose an option: ");

        //User chooses which option they want.
        int choice = scanner.nextInt();
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        double result = 0;

        //Calculation for the temperature options.
        switch (choice) {
            case 1:
                result = (value * 9 / 5) + 32;
                System.out.println(value + " °C = " + result + " °F");
                break;
            case 2:
                result = (value - 32) * 5 / 9;
                System.out.println(value + " °F = " + result + " °C");
                break;
            case 3:
                result = value + 273.15;
                System.out.println(value + " °C = " + result + " K");
                break;
            case 4:
                result = value - 273.15;
                System.out.println(value + " K = " + result + " °C");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
