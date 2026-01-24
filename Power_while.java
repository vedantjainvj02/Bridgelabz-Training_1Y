import java.util.Scanner;

class Power_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        System.out.println("Enter the power : ");
        int power = scanner.nextInt();

        int result = 1;
        int i = 1;
        if ( number > 0 &&  power> 0){
            while (i <= power){
                result *= number;
                i++;
            }
        }
        else 
            System.out.println("Enter a positive number and power");

        System.out.println(result);
    }
 }