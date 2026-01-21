import java.util.Scanner;

class Marks_PCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sam's marks in Mathematics: ");
        int mathematics = scanner.nextInt();
        System.out.print("Enter Sam's marks in Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter Sam's marks in Chemistry: ");
        int chemistry = scanner.nextInt();
        int total = physics + chemistry + mathematics;
        double avg_marks = total/ 3.0;
        System.out.println("Sam's average marks: " + avg_marks);
    }
}