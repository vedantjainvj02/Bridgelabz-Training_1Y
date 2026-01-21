import java.util.Scanner;

class Divisibilty{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println("Is the " + number + " divisible by 5 ? YES");
        } else {
            System.out.println("Is the " + number + " divisible by 5 ? NO");
        }

    }
}