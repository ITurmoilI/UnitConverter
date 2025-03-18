package converters;

import java.util.Scanner;

public class VolumeConverter {
    public static void convert(Scanner scanner) {

        //User is shown the options for volume.
        System.out.println("\nVolume Conversion");
        System.out.println("1. Litres to Gallons");
        System.out.println("2. Gallons to Litres");
        System.out.println("3. Milliliters to Ounces");
        System.out.println("4. Ounces to Milliliters");
        System.out.print("Choose an option: ");

        //User chooses which option they want.
        int choice = scanner.nextInt();
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        double result = 0;

        //Calculations for the volume options.
        switch (choice) {
            case 1:
                result = value * 0.264172;
                System.out.println(value + " litres = " + result + " gallons");
                break;
            case 2:
                result = value * 3.78541;
                System.out.println(value + " gallons = " + result + " litres");
                break;
            case 3:
                result = value * 0.033814;
                System.out.println(value + " milliliters = " + result + " ounces");
                break;
            case 4:
                result = value * 29.5735;
                System.out.println(value + " ounces = " + result + " milliliters");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}