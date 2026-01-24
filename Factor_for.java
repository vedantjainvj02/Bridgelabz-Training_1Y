import java.util.Scanner;

class Factor_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();

        if (number>0){
            for (int i = 1 ; i <= number ; i++){
                if (i % number == 0)
                    System.out.println(i);
            }
        }
    }
}
