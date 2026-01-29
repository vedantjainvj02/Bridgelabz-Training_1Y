import java.util.*;

class store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array : ");
        int num =scanner.nextInt();

        double[] arr = new double[num];
        double total = 0.0 ;
        int index = 0;
        while (index < num ) { 
            System.out.print("Enter an element : ");
            int insert = scanner.nextInt();

            if( insert <= 0)
                break;
            else
                arr[index] = insert;
                index++;
        }

        for (int i = 0 ; i < num ; i++){
            total += arr[i];
        }
        System.out.println(total);
    }    
}
