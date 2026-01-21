import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base number: ");
        double base = input.nextDouble();
        System.out.println("Enter exponent: ");
        double exponent = input.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}