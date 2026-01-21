import java.util.Scanner;

class Factorial_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println("Factorial of " + n + " is " + total);
    }
}