
import java.util.Scanner;

class Park {
    public static void round(int distance , int perimeter){
        double round = distance/perimeter;
        System.out.println("Number of round = " + round);
    }
    public static int peri(int side1 , int side2 , int side3){
        int perimeter = side1 + side2 + side3;
        return perimeter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side 1 : ");
        int side1 = scanner.nextInt();
        System.out.print("Enter the side 2 : ");
        int side2 = scanner.nextInt();
        System.out.print("Enter the side 3 : ");
        int side3 = scanner.nextInt();

        int perimeter = peri(side1, side2, side3);
        round(5000 , perimeter);
    }    
}
