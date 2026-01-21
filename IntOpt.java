import java.util.Scanner;

class IntOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter second number: ");
        int c = scanner.nextInt();
        int f1 = a+b*c;
        int f2 = a*b+c;
        int f3 = c+a/b;
        int f4 = a%b+c;
        System.out.println(f1 + "\n" + f2 + "\n" + f3 + "\n" + f4);
    }
}