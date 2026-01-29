import java.util.*;

class multi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int len = arr.length;
        int[] arr_m = new int[len];

        for (int i = 0 ; i < len ; i++ ){
            arr_m[i] = num * arr[i];
        }
        
        for (int i = 0 ; i < len ; i++){
            System.out.println(num + " * " + arr[i] + " = " + arr_m[i]);
        }
    }    
}
