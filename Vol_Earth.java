import java.util.Scanner;
class Vol_Earth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of Earth in km: ");
        double radius_km = scanner.nextDouble();
        System.out.print("Enter the radius of Earth in miles: ");
        double radius_miles = scanner.nextDouble();
        double volume_km = (4.0/3.0) * Math.PI * Math.pow(radius_km, 3);
        double volume_miles = (4.0/3.0) * Math.PI * Math.pow(radius_miles, 3);
        System.out.println("The Volume of Earth in cubic km is " + volume_km + " and cubic miles is " + volume_miles);
    }
}