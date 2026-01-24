import java.util.Scanner;

class Multi_under_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();

        if(number > 0 && number < 100){
            for (int i = 100 ; i >= 1 ; i--) {
                if (i % number == 0)
                    System.out.println(number);
                    continue;
            }
        }
    }
}
