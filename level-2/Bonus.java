import java.util.*;

class Bonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int employees = 10;

        double[] salary = new double[employees];
        double[] years = new double[employees];
        double[] bonus = new double[employees];
        double[] newSalary = new double[employees];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < employees; i++) {
            System.out.println("Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double s = scanner.nextDouble();

            System.out.print("Enter years of service: ");
            double y = scanner.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        for (int i = 0; i < employees; i++) {

            if (years[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        for (int i = 0; i < employees; i++) {
            System.out.println("Employee " + (i + 1) + "\nOld Salary: " + salary[i] + "\nBonus: " + bonus[i] + "\nNew Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary : " + totalOldSalary);
        System.out.println("Total Bonus Paid : " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);
    }
}
