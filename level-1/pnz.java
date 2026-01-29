import java.util.*;

class pnz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the element : ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < num ; i++ ){
            if (arr[i] < 0)
                System.out.println("The element is negative");
            else if (arr[i] > 0){
                System.out.println("The element is positive");
                if (arr[i] % 2 == 0)
                    System.out.println("The element is even");
                else
                    System.out.println("The  element is odd");
            }
            else if (arr[i] == 0 )
                System.out.println("The element is zero");
        }
        if (arr[0] > arr[-1])
            System.err.println("The first element is greater than the last element");
        else if (arr[0] < arr[-1])
            System.err.println("The first element is smaller than the last element");
        else if (arr[0] == arr[-1])
            System.err.println("The first element is equal to the last element");
    }
}