import java.util.Scanner;

class Pen_division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of pens: ");
        int totalPens = scanner.nextInt();
        System.out.print("Enter the number of students: ");
        int totalStudents = scanner.nextInt();
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}