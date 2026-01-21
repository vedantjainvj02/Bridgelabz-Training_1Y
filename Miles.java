import java.util.Scanner;
class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("Distance in miles: " + miles);
    }
}