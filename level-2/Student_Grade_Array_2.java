import java.util.*;

class Student_Grade_Array_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics marks: ");
            int p = scanner.nextInt();

            System.out.print("Chemistry marks: ");
            int c = scanner.nextInt();

            System.out.print("Maths marks: ");
            int m = scanner.nextInt();

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks. Enter again.");
                i--;
                continue;
            }

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }

        for (int i = 0; i < n; i++) {
            percentage[i] =
                (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + "\n%: " + percentage[i] + "\nGrade: " + grade[i] );
        }
    }
}
