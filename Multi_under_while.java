import java.util.Scanner;

class Multi_under_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int counter = number - 1 ;

        if(number > 0 && number < 100){
            while ( counter >= 1) {
                if ( counter % number == 0){
                    System.out.println(number);
                    counter--;
                    continue;
                }
            }
        }
    }
}
