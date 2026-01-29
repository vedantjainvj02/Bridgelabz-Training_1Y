import java.util.*;

class multi_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (6-9) : ");
        int num = scanner.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int length = arr.length;
        int[] multiplicationResult = new int[length];

        for (int i = 1 ; i < length ; i++){
            multiplicationResult[i] = arr[i] * num;
        }

        for (int i = 0 ; i < length ; i++){
            System.out.println(num + " * " + arr[i] + " = " + multiplicationResult[i]);
        }
    }
}
