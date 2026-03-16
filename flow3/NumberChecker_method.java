import java.util.Scanner;

public class NumberChecker_method {
    public static int countDigits(int num) {
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
    public static int[] storeDigits(int num){
        int n = countDigits(num);
        int[] digits = new int[n];
        
        for(int i=n-1;i>=0;i--){
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }
    public static boolean isDuck(int[] digits){
        for(int d : digits){
            if(d == 0) return true;
        }
        return false;
    }
    public static boolean isArmstrong(int num, int[] digits){
        int power = digits.length;
        int sum = 0;

        for(int d : digits){
            sum += Math.pow(d,power);
        }
        return sum == num;
    }
    public static void largestSecondLargest(int[] digits){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int d:digits){
            if(d > largest){
                second = largest;
                largest = d;
            }
            else if(d > second && d != largest){
                second = d;
            }
        }
        System.out.println("Largest = "+largest);
        System.out.println("Second Largest = "+second);
    }
    public static void smallestSecondSmallest(int[] digits){
        int small = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int d:digits){
            if(d < small){
                second = small;
                small = d;
            }
            else if(d < second && d != small){
                second = d;
            }
        }
        System.out.println("Smallest = "+small);
        System.out.println("Second Smallest = "+second);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] digits = storeDigits(num);
        
        System.out.println("Digits = "+countDigits(num));
        System.out.println("Duck Number = "+isDuck(digits));
        System.out.println("Armstrong = "+isArmstrong(num,digits));
        
        largestSecondLargest(digits);
        smallestSecondSmallest(digits);
    }
}