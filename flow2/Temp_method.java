import java.util.Scanner;

public class Temp_method {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        System.out.println(" Enter the Number for conversion :->");
        System.out.println(" 1 FAHRENHEIT to CELSIUS \n 2 CELSIUS to FAHRENHEIT \n 3 POUNDS TO KG \n 4 KG to POUNDS \n 5 GALLONS to LITRES \n 6 LITRES to GALLONS ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the Converstion : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 :
                System.out.println("100 F to Celsius = " + convertFahrenheitToCelsius(100));
                break;
            case 2 :
                System.out.println("37 C to Fahrenheit = " + convertCelsiusToFahrenheit(37));
                break;
            case 3 :
                System.out.println("10 pounds to kg = " + convertPoundsToKilograms(10));
                break;
            case 4 :
                System.out.println("5 kg to pounds = " + convertKilogramsToPounds(5));
                break;
            case 5 :
                System.out.println("2 gallons to liters = " + convertGallonsToLiters(2));
                break;
            case 6 :
                System.out.println("10 liters to gallons = " + convertLitersToGallons(10));
                break;
            default:
                System.out.println("Wrong Input :");
                break;
        }  
    }
}