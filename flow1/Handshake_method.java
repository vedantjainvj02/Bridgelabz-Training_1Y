import java.util.Scanner;

class Handshake_method {
    public static void number(int numStudents){
        int totalHandshakes = (numStudents * (numStudents - 1)) / 2;
        System.out.println("The total number of possible handshakes is " + totalHandshakes);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        number(numStudents);
        
    }
}