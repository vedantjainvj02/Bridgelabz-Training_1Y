import java.util.Scanner;

class Count_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scanner.nextInt();

        int count = 0 ;

        while ( number > 0 ){
            int division = number / 10;
            count++;

            number = division ;
        }

        System.out.println(count);
    }
}