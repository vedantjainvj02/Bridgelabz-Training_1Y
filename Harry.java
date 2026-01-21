import java.util.Scanner;

class Harry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Harry's Birth Year: ");
        int birth_year = input.nextInt();
        System.out.println("Enter Current Year: ");
        int current_year = input.nextInt();
        int age = current_year - birth_year;
        System.out.println("Harry's age in " + current_year + " is " + age);
    }    
}
