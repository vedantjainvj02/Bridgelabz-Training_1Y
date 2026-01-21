class Discount {
    public static void main(String[] args) {
        double originalPrice = 125000;
        double discountPercentage = 10;
        double discountAmount = (originalPrice * discountPercentage) / 100;
        double finalPrice = originalPrice - discountAmount;
        System.out.println("The Discount Amount is INR " + discountAmount + " and the Final Discounted Fee is INR " + finalPrice);
    }
}