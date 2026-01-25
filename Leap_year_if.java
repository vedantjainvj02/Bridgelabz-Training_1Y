import java.util.Scanner;

class Leap_year_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = scanner.nextInt();

        if (year > 1582){
            if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0) )
                System.out.println("The year " + year + " is a Leap Year");
            else
                System.out.println("The year " + year + " is not a Leap Year");
        }
    }
}