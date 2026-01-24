import java.util.Scanner;

class Factor_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int counter = 1;

        if(number > 0){
            while (counter > number){
                if (counter % number == 0)
                    System.out.println(counter);
                counter++;
            }
        }
    }
}
