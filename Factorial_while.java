import java.util.Scanner;

class Factorial_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int total = 1;
        while (n > 0){
            total *= n;
            n--;
        }
        System.out.println("Factorial of " + n + " is " + total);
    }
}