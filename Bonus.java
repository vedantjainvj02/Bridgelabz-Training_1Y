import java.util.Scanner;

class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Year of Service: ");
        int year = scanner.nextInt();
        System.out.println("Enter the Salary:");
        double salary = scanner.nextDouble();
        double bonus = 0.05;
        double total = 0.0;
        if(year>5){
            total = salary + (salary * bonus);
            System.out.println("The Salary after bonus is " + total);
        }
    }
}