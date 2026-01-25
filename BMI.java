import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight (kg) :");
        int weight = scanner.nextInt();
        System.out.println("Enter the height (cm):");
        int height = scanner.nextInt();

        int height_m = height / 100 ;

        int bmi = weight / (height_m * height_m) ;

        if (bmi <= 18.4)
            System.out.println("Status : Underweight");
        else if (bmi > 8.4 && bmi <= 24.9)
            System.out.println("Status : Normal");
        else if (bmi > 24.9 && bmi <= 39.9)
            System.out.println("Status : Overweight");
        else if (bmi >= 40)
            System.out.println("Status : Obese");
    }
}