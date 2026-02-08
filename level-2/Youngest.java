import java.util.*;

class Youngest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Age: ");
            age[i] = scanner.nextInt();

            System.out.print("Height: ");
            height[i] = scanner.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex])
                youngestIndex = i;

            if (height[i] > height[tallestIndex])
                tallestIndex = i;
        }

        System.out.println("\nYoungest Friend : " + names[youngestIndex]);
        System.out.println("Tallest Friend  : " + names[tallestIndex]);
    }
}
