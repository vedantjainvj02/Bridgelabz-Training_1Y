import java.util.Scanner;

class Area_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double radius = input.nextDouble();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}