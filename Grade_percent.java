import java.util.Scanner;

class Grade_percent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks (Physics) :");
        int marks_p = scanner.nextInt();
        System.out.println("Enter the marks (Chemistry) :");
        int marks_c = scanner.nextInt();
        System.out.println("Enter the marks (Maths) :");
        int marks_m = scanner.nextInt();

        double total = marks_c + marks_p + marks_p;
        double percent = total / 3;

        if (percent > 80)
            System.out.println(percent + "Grade A - Level 4, above agency-normalized standards");
        else if (percent < 80 && percent >= 70)
            System.out.println(percent + "Grade B - Level 3, at agency-normalized standards");
        else if (percent < 70 && percent >= 60)
            System.out.println(percent + "Grade C - Level 2, below , but approaching agency-normalized standards");
        else if (percent < 60 && percent >= 50)
            System.out.println(percent + "Grade B - Level 1, well below agency-normalized standards");
        else if (percent < 50 && percent >= 40)
            System.out.println(percent + "Grade B - Level 1- , too below agency-normalized standards");
        else if (percent < 40)
            System.out.println(percent + "Grade R - Remedial standards");
    }    
}
