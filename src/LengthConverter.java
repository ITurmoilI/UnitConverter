package converters;
import java.util.Scanner;

public class LengthConverter {
    public static void convert(Scanner scanner) {

        //User is shown the options for length.
        System.out.println("\nLength Conversion");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Miles");
        System.out.println("3. Miles to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Choose an option: ");

        //User chooses which option they want.
        int choice = scanner.nextInt();
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        double result = 0;

        //Calculations of the length options.
        switch (choice) {
            case 1:
                result = value / 1000;
                System.out.println(value + " meters = " + result + " kilometers");
                break;
            case 2:
                result = value * 0.621371;
                System.out.println(value + " kilometers = " + result + " miles");
                break;
            case 3:
                result = value * 5280;
                System.out.println(value + " miles = " + result + " feet");
                break;
            case 4:
                result = value * 0.3048;
                System.out.println(value + " feet = " + result + " meters");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
