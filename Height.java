import java.util.Scanner;

class Height {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height in centimeters: ");
        double heightInCm = scanner.nextDouble();
        double heightInInches = heightInCm / 2.54;
        double heightInFeet = heightInCm / 12;

        System.out.println("The Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and in inches is " + String.format("%.2f", heightInInches));
    }
}