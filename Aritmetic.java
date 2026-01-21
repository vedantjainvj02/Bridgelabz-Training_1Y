import java.util.Scanner;

class Aritmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        double sum, diff , prod , div;
         sum = num1 + num2;
         diff = num1 - num2;
         prod = num1 * num2;
         div = (double)num1 / num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + sum + " is " + diff + " , " + prod + " , and " + div);
    }
}