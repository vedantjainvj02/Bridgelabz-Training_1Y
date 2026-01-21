import java.util.Scanner;

class SI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        double principal = input.nextDouble();
        System.out.println("Enter rate of interest: ");
        double rate = input.nextDouble();
        System.out.println("Enter time period: ");
        double time = input.nextDouble();
        double simple_interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simple_interest);
    }
}