import java.util.Scanner;

class Sum_n_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum_l = 0;
        for (int i = 1; i <= n; i++) {
            sum_l += i;
        }
        int sum_f = n*(n+1) / 2;

        if (sum_l == sum_f)
            System.out.println("The result with formulae and the 'for' loop is same");
        else
            System.out.println("The result with formulae and the 'for' loop is not same");
        
    }
}