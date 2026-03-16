import java.util.Scanner;

class SpringSeason {
    public static boolean d_m(int date , int month){
        if (date >= 20 && ( month >= 3 && month <= 6) )
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Date : ");
        int date = scanner.nextInt();
        System.out.print("Enter the Month : ");
        int month = scanner.nextInt();

        SpringSeason s1 = new SpringSeason();
        boolean result = d_m(date, month);

        if (result)
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
