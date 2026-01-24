import java.util.Scanner;

class Greatest_factor_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int greatestFactor = 1;

        if(number > 0){
            for (int i = number - 1 ; i >= 1 ; i--) {
                if (number % i == 0){
                    greatestFactor *= i;
                    break;
                }
            }
        }
        System.out.println(greatestFactor);
    }
}
