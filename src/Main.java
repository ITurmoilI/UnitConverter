import converters.LengthConverter;
import converters.TemperatureConverter;
import converters.WeightConverter;
import converters.VolumeConverter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Giving the user options to choose from.
        while (true) {
            System.out.println("\nUnit Converter");
            System.out.println("1. Length Conversion");
            System.out.println("2. Temperature Conversion");
            System.out.println("3. Weight Conversion");
            System.out.println("4. Volume Conversion");
            System.out.println("5. Exit");

            //asking the user what option they choose.
            System.out.print("Choose an option: ");

            //If the user picks option 4 which is exit the program will then close.
            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting program, Thank you for using me.");
                break;
            }

            //Switch statements for the user to choose which option they want.
            switch (choice) {
                case 1:
                    LengthConverter.convert(scanner);
                    break;
                case 2:
                    TemperatureConverter.convert(scanner);
                    break;
                case 3:
                    WeightConverter.convert(scanner);
                    break;
                case 4:
                    VolumeConverter.convert(scanner);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}