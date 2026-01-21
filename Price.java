import java.util.Scanner;

class Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        double price = scanner.nextDouble();
        System.out.print("Enter the quantity brought: ");
        double quantity = scanner.nextDouble();
        double totalCost = price * quantity;
        System.out.println("The total cost is " + totalCost);
    }
}