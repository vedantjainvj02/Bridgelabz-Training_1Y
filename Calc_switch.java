import java.util.Scanner;

class Calc_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int number_1 = scanner.nextInt();
        System.out.println("Enter the second number :");
        int number_2 = scanner.nextInt();
        System.out.println("Enter the operator (+ , -  , * , / ) :");
        String operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.println("The sum of " + number_1 + " and " + number_2 + " is " + (number_1 + number_2));
                break;
            case "-":
                System.out.println("The sum of " + number_1 + " and " + number_2 + " is " + (number_1 - number_2));
                break;
            case "*":
                System.out.println("The sum of " + number_1 + " and " + number_2 + " is " + (number_1 * number_2));
                break;
            case "/":
                System.out.println("The sum of " + number_1 + " and " + number_2 + " is " + (number_1 / number_2));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}           