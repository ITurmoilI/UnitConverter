package converters;
import java.util.Scanner;

public class WeightConverter {
    public static void convert(Scanner scanner) {

        //User is shown the options for weight.
        System.out.println("\nWeight Conversion");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.println("3. Grams to Ounces");
        System.out.println("4. Ounces to Grams");
        System.out.print("Choose an option: ");

        //User chooses which option they want.
        int choice = scanner.nextInt();
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        double result = 0;

        //Calculation for the weight options.
        switch (choice) {
            case 1:
                result = value * 2.20462;
                System.out.println(value + " kg = " + result + " lbs");
                break;
            case 2:
                result = value * 0.453592;
                System.out.println(value + " lbs = " + result + " kg");
                break;
            case 3:
                result = value * 0.035274;
                System.out.println(value + " g = " + result + " oz");
                break;
            case 4:
                result = value * 28.3495;
                System.out.println(value + " oz = " + result + " g");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
