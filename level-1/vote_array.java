import java.util.*;

class vote_array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0 ; i < num ; i++){
            System.out.print("Enter the age of the student : ");
            arr[i] = scanner.nextInt();
        }
        int len = arr.length;
        for (int i = 0 ; i < len ; i++){
            if (arr[i] < 0 )
                System.out.println("Invalid age!");
            else if (arr[i] >= 18)
                System.out.println("The student with the age " + arr[i] + " can vote.");
            else if (arr[i] < 18)
                System.out.println("The student with the age " + arr[i] + " cannot vote.");
        }
    }
}