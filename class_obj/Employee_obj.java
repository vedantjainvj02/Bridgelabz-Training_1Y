class Employee_method {
    String name;
    int id;
    double salary;

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee_method emp = new Employee_method();
        
        emp.name = "Rahul";
        emp.id = 101;
        emp.salary = 50000;

        emp.displayDetails();
    }
}