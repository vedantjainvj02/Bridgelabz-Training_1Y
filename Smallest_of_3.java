import java.util.Scanner;
class Smallest_of_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? YES");
        } else if (number2 < number1 && number2 < number3) {
            System.out.println("Is the first number the smallest? NO");
        } else if (number3 < number1 && number3 < number2) {
            System.out.println("Is the first number the smallest? NO");
        }
    }
}