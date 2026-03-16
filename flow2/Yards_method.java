import java.util.Scanner;

public class Yards_method {
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    public static void main(String[] args) {
        System.out.println(" Enter the Number for conversion :->");
        System.out.println(" 1 YARD to FEET \n 2 FEET to YARD \n 3 METER TO INCHES \n 4 INCHES to METER \n 5 INCHES to CM ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the Converstion : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 :
                System.out.println("5 yards to feet = " + convertYardsToFeet(5));
                break;
            case 2 :
                System.out.println("9 feet to yards = " + convertFeetToYards(9));
                break;
            case 3 :
                System.out.println("2 meters to inches = " + convertMetersToInches(2));
                break;
            case 4 :
                System.out.println("10 inches to meters = " + convertInchesToMeters(10));
                break;
            case 5 :
                System.out.println("5 inches to cm = " + convertInchesToCm(5));
                break;
            default:
                System.out.println("Wrong Input :");
                break;
        }  
    }
}