import java.util.Scanner;

class Mile_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = scanner.nextDouble();
        double miles = km * 1.60934;
        System.out.println("The total miles is " + miles + "mile for the given " + km + "km");
    }
}
