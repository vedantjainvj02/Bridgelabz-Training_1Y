import java.util.*;

class football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (6-9) : ");
        int num = scanner.nextInt();

        double[] heights = new double[num];
        int sum = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the height : ");
            heights[i] = scanner.nextDouble();
        }

        for (int i = 0; i < num ; i++){
            sum+= heights[i];
        }

        double mean = sum/num ;
        System.out.println("The mean height of the football team is " + mean);
    }    
}
