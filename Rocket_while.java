import java.util.Scanner;

class Rocket_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int counter = scanner.nextInt();
        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }
    }
}