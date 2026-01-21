import java.util.Scanner;

class Sum_n_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum_l = 0;
        while (n <=0 ){
            sum_l += n;
            n--;
        }
        int sum_f = n*(n-1) / 2;

        if (sum_l == sum_f)
            System.out.println("The result with formulae and the 'while' loop is same");
        else
            System.out.println("The result with formulae and the 'while' loop is not same");
        
    }
}