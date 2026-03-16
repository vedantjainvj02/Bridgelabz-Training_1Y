class Circle_obj {
    double radius;

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    public void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }
    public static void main(String[] args) {
        Circle_obj c = new Circle_obj();

        c.radius = 7;

        c.calculateArea();
        c.calculateCircumference();
    }
}