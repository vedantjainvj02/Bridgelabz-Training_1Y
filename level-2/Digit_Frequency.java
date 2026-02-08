import java.util.*;

class Digit_Frequency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        int index = 0;

        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int[] freq = new int[10];

        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }
    }
}
