import java.util.Scanner;

class Yard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double dist_ft = scanner.nextDouble();
        double dist_yd = dist_ft / 3;
        double dist_m = dist_yd / 1760;
        System.out.println("The distance in yards is " + dist_yd + " and in miles is " + dist_m + " of the given feet " + dist_ft);
    }
}