import java.util.Scanner;

public class Miles_method {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    public static void main(String[] args) {
        System.out.println(" Enter the Number for conversion :->");
        System.out.println(" 1 KM to MILES \n 2 MILES to KM \n 3 METERS TO FEET \n 4 FEET to METERS ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the Converstion : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 :
                System.out.println("10 km to miles = " + convertKmToMiles(10));
                break;
            case 2 :
                System.out.println("5 miles to km = " + convertMilesToKm(5));
                break;
            case 3 :
                System.out.println("3 meters to feet = " + convertMetersToFeet(3));
                break;
            case 4 :
                System.out.println("10 feet to meters = " + convertFeetToMeters(10));
                break;
            default:
                System.out.println("Wrong Input :");
                break;
        }
    }
}