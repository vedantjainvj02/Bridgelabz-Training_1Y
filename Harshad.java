import java.util.Scanner;

class Harshad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scanner.nextInt();

        int store = number ;
        int sum = 0;

        while ( number > 0 ){
            int reminder = number % 10 ;
            sum += reminder ;
            int division = number / 10;
            number = division ;
        }


        if ( number % sum == 0 )
            System.out.println("Number is Harshad");
        else 
            System.out.println("Number is not Harshad");
    }
}