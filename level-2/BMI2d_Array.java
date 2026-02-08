import java.util.*;

class BMI2d_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight (kg): ");
            double weight = scanner.nextDouble();

            System.out.print("Enter height (m): ");
            double height = scanner.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        for (int i = 0; i < number; i++) {
            personData[i][2] =
                personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("\n--- BMI DETAILS ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + "\nWeight: " + personData[i][0] + "\nHeight: " + personData[i][1] + "\nBMI: " + personData[i][2] + "\nStatus: " + weightStatus[i]);
        }
    }
}
