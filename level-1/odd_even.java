import java.util.*;

class odd_even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        int size = number / 2 + 1 ;

        int[] odd = new int[size];
        int[] even = new int[size];

        int odd_var = 0;
        int even_var = 0;

        if (number > 0){
            for (int i = 1; i <= number ; i++) {
                if (i % 2 == 0){
                    even[even_var] = i;
                    even_var++;
                }
                else if (i % 2 != 0){
                    odd[odd_var] = i;
                    odd_var++;
                }
            }
        }
        else 
            System.out.println("The number is not a natural number");

        for (int i = 0 ; i < odd_var;  i++){
            System.out.println("Odd Numbers : " + odd[i]);
        }
        for (int i = 0 ; i < even_var ; i++){
            System.out.println("Even Numbers : " + even[i]);
        }
    }    
}
