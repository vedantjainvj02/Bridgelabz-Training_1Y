import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scanner.nextInt();

        int store = number ;
        int sum = 0;
        
        while ( number > 0 ){
            int reminder = number % 10 ;
            int cube = reminder * reminder * reminder;
            int quotient = number/10;
            number = quotient;
            sum += cube;
        }

        if ( store == sum )
            System.out.println("The number " + store + " is a Armstrong number");
        else 
            System.out.println("The number " + store + " is not a Armstrong number");
    }
}
