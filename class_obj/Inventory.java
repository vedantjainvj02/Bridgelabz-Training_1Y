class Inventory {
    int itemCode;
    String itemName;
    double price;

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
    public void calculateTotalCost(int quantity) {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }
    public static void main(String[] args) {
        Inventory item = new Inventory();

        item.itemCode = 101;
        item.itemName = "Laptop";
        item.price = 50000;

        item.displayDetails();
        item.calculateTotalCost(2);
    }
}