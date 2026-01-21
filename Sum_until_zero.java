import java.util.Scanner;

class Sum_until_zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        
        System.out.print("Enter a number (0 to stop): ");
        double number = scanner.nextDouble();
        
        while (number != 0) {
            total += number;
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextDouble();
        }
        
        System.out.println("Sum of all numbers entered: " + total);
    }
}