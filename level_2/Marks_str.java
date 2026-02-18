import java.util.*;

class Marks_str {

    public int[][] generateMarks(int n) {

        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 90) + 10;
            }
        }

        return marks;
    }

    public double[][] calculateResult(int[][] marks) {

        int n = marks.length;
        double[][] result = new double[n][3];
        for (int i = 0; i < n; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }

        return result;
    }

    public String[] assignGrade(double[][] result) {

        int n = result.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {

            double p = result[i][2];
            if (p >= 80)
                grades[i] = "A";
            else if (p >= 70)
                grades[i] = "B";
            else if (p >= 60)
                grades[i] = "C";
            else if (p >= 50)
                grades[i] = "D";
            else if (p >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }

        return grades;
    }

    public void display(int[][] marks, double[][] result, String[] grades) {

        System.out.println("\nStudent\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i+1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grades[i]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        Marks_str obj = new Marks_str();
        int[][] marks = obj.generateMarks(n);
        double[][] result = obj.calculateResult(marks);
        String[] grades = obj.assignGrade(result);
        obj.display(marks, result, grades);

    }
}
