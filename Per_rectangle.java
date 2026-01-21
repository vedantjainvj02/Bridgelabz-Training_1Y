import java.util.Scanner;

class Per_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        double length = input.nextDouble();
        System.out.println("Enter breadth of rectangle: ");
        double breadth = input.nextDouble();
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}