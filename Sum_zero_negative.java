import java.util.Scanner;

class Sum_zero_negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double number = scanner.nextDouble();
            if (number <= 0) {
                break;
            }else{
                total += number;
            }
        }
        System.out.println("Sum of all numbers entered: " + total);
    }
}