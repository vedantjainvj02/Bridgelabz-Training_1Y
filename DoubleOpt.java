import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextInt();
        System.out.print("Enter second number: ");
        double b = scanner.nextInt();
        System.out.print("Enter second number: ");
        double c = scanner.nextInt();
        double f1 = a+b*c;
        double f2 = a*b+c;
        double f3 = c+a/b;
        double f4 = a%b+c;
        System.out.println(f1 + "\n" + f2 + "\n" + f3 + "\n" + f4);
    }
}