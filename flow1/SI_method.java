import java.util.Scanner;

class SI_method {
    public static void SI(double principal , double rate , double time){
        double si = (principal * rate * time ) / 100;
        System.out.println("The Simple Interest is " + si + " for Principal " + principal + " , for Rate of Interest " + rate + " and Time " + time);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Principal amount : ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the Rate of Interest amount : ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the Time : ");
        double time = scanner.nextDouble();

        SI(principal, rate, time);
    }
}
