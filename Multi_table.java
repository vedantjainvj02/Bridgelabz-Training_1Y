import java.util.Scanner;

class Multi_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (6-9) : ");
        int num = scanner.nextInt();
        if (num > 6 && num < 9){
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        }
        else
            System.out.println("Number is out of range");
    }
}