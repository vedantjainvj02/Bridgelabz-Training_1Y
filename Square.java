import java.util.Scanner;

class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double peri = scanner.nextDouble();
        double side = peri / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + peri);
    }
}