import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scanner.nextInt();
        boolean isPrime = false;

        if (number % 1 == 0 && number % number == 0 )
            isPrime = true ;

        for (int i = 2 ; i < number ; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("The number " + number + " is a prime number");
        else
            System.out.println("The number " + number + " is not a prime number");
    }
}
