import java.util.*;

class md_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows = scanner.nextInt();

        System.out.print("Enter the columns : ");
        int col = scanner.nextInt();

        int arr_2d[][] = new int[rows][col];

        System.out.println("Enter the elements : ");
        for (int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < col ; j++){
                arr_2d[i][j] = scanner.nextInt();
            }
        }

        int arr_1d[] = new int[rows*col];
        int index = 0 ;

        for (int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < col ; j++){
                arr_1d[index] = arr_2d[i][j];
                index++;
            }
        }

        for(int i = 0 ; i < index ; i++){
            System.out.print(arr_1d[i] + " ");
        }

    }
}
