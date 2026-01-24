
import java.util.Scanner;

class Age_height {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 3;
        System.out.println("Enter the age of Amar : ");
        int age_1 = scanner.nextInt();
        System.out.println("Enter the age of Akbar : ");
        int age_2 = scanner.nextInt();
        System.out.println("Enter the age of Anthony : ");
        int age_3 = scanner.nextInt();

        System.out.println("Enter the height of Amar (cm) : ");
        int height_1 = scanner.nextInt();
        System.out.println("Enter the height of Akbar (cm) : ");
        int height_2 = scanner.nextInt();
        System.out.println("Enter the height of Anthony (cm) : ");
        int height_3 = scanner.nextInt();

        if (age_1 < age_2 && age_1 < age_3)
            System.out.println("Amar is the youngest");
        else if (age_2 < age_1 && age_2 < age_3)
            System.out.println("Akbar is the youngest");
        else if (age_3 < age_1 && age_3 < age_2)
            System.out.println("Anthony is the youngest");

        if (height_1 > height_2 && height_1 > height_3)
            System.out.println("Amar is the tallest");
        else if (height_2 > height_1 && height_2 > height_3)
            System.out.println("Akbar is the tallest");
        else if (height_3 > height_1 && height_3 > height_2)
            System.out.println("Anthony is the tallest");

    }
}
