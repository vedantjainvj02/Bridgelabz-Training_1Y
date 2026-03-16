class MobilePhone {
    String brand;
    String model;
    double price;

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();

        phone.brand = "Apple";
        phone.model = "iPhone 15";
        phone.price = 79999;

        phone.displayDetails();
    }
}