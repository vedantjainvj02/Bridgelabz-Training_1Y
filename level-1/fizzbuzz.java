import java.util.*;

class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        String arr[] = new String[number];
        int index = 0;

        if (number > 0){
            for (int i = 0 ; i < number ; i++ ){
                if (i % 3 == 0 && i % 5 == 0)
                    arr[i] = "FizzBuzz";
                else if (i % 3 == 0)
                    arr[i] = "Fizz";
                else if (i % 5 == 0)
                    arr[i] = "Buzz";
                else 
                    arr[i] = "" + i;

                index++;
            }
        }

        for (int i = 1 ; i < index ; i++ ){
            System.out.println("Position "+ i + " = " + arr[i]);
        }
    }    
}
