import java.util.Scanner;

class Day_of_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month :");
        int month = scanner.nextInt();
        System.out.println("Enter the date :");
        int date = scanner.nextInt();
        System.out.println("Enter the year :");
        int year = scanner.nextInt();

        int y0 = year - (14 - month) / 12 ;
        int x = y0 + (y0/4) - (y0/100) + (y0/400) ;
        int m0 = month + 12 * ((14-month)/12) - 2 ;
        int d0 =  (date + x + (31 * m0) / 12) % 7 ;

        System.out.println("\n");
        System.out.println("0 is Sunday");
        System.out.println("1 is Monday");
        System.out.println("2 is Tuesday");
        System.out.println("3 is Wednesday");
        System.out.println("4 is Thursday");
        System.out.println("5 is Friday");
        System.out.println("6 is Saturday");
        System.out.println("\n");
        System.out.println("The day of the week is " + d0);
    }
}