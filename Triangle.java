import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in cm: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double height = scanner.nextDouble();
        double area_cm = ( base * height ) / 2;
        double area_in = area_cm * 0.155;
        System.out.println("The area of the triangle in sq inches is " + area_in + " and in sq cm is " + area_cm);
    }
}