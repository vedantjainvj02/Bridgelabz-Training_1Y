import java.util.Scanner;

class Handshake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int totalHandshakes = (numStudents * (numStudents - 1)) / 2;
        System.out.println("The total number of possible handshakes is " + totalHandshakes);
    }
}