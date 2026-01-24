import java.util.Scanner;

class Greatest_factor_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int greatestFactor = 1;
        int counter = number - 1;

        if(number > 0){
            while ( counter >= 1) {
                if (number % counter == 0){
                    greatestFactor *= counter;
                    break;
                }
                counter--;
            }
        }
        System.out.println(greatestFactor);
    }
}
