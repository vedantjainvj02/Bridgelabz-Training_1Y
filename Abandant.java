import java.util.Scanner;

class Abandant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scanner.nextInt();

        int store = number ;
        int sum = 1;

        for (int i = 2 ; i < number ; i++){
            if (number % i == 0){
                sum += i;
            }
        }

        if ( store < sum )
            System.out.println("Number is an Abandant Number");
        else 
            System.out.println("Number is not an Abandant Number");
    }
}