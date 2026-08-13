import java.util.Scanner; // Import for user input

public class Temperature_Converter {

    public static void main(String[] args) {

        // Basic version with fixed temperature
        double fahrenheit = 98.6;

        // Conversion formula: (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Formatted output with 2 decimal places
        System.out.printf("[Fixed Value] %.2f°F = %.2f°C%n",
                fahrenheit, celsius);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("\nEnter temperature in Fahrenheit: ");
            double userFahrenheit = scanner.nextDouble();

            // Input validation
            if (userFahrenheit < -459.67) {
                System.out.println("Invalid input: Absolute zero exceeded");
            } else {

                // Reuse conversion logic
                double userCelsius = (userFahrenheit - 32) * 5 / 9;

                System.out.printf("[User Input] %.2f°F = %.2f°C%n",
                        userFahrenheit, userCelsius);

                // Reverse conversion
                double reverseF = (userCelsius * 9 / 5) + 32;

                System.out.printf("[Reverse] %.2f°C = %.2f°F%n",
                        userCelsius, reverseF);

                // Kelvin conversion
                double kelvin = (userFahrenheit - 32) * 5 / 9 + 273.15;

                System.out.printf("[Kelvin] %.2f°F = %.2fK%n",
                        userFahrenheit, kelvin);
            }

            // Ask whether to continue
            System.out.print("Convert another? (y/n): ");

            if (!scanner.next().equalsIgnoreCase("y")) {
                break;
            }
        }

        scanner.close();
    }
}