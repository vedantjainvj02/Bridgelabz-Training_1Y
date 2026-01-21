import java.util.Scanner;

class Vol_Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of cylinder: ");
        double radius = input.nextDouble();
        System.out.println("Enter height of cylinder: ");
        double height = input.nextDouble();
        double pi = 3.14;
        double volume = pi * radius * radius * height;
        System.out.println("Volume of cylinder: " + volume);
    }
}