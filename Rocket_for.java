import java.util.Scanner;

class Rocket_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int counter = scanner.nextInt();
        for (int i = counter; i > 0; i--) {
            System.out.println(i);
        }
    }
}