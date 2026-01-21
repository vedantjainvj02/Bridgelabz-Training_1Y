import java.util.Scanner;

class Discount_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fee: ");
        double originalPrice = scanner.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();
        double discountAmount = (originalPrice * discountPercentage) / 100;
        double finalPrice = originalPrice - discountAmount;
        System.out.println("The Discount Amount is INR " + discountAmount + " and the Final Discounted Fee is INR " + finalPrice);
    }
}