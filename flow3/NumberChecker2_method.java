import java.util.*;

public class NumberChecker2_method {
    public static int[] storeDigits(int num){
        int temp=num,count=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        int[] digits=new int[count];
        for(int i=count-1;i>=0;i--){
            digits[i]=num%10;
            num/=10;
        }
        return digits;
    }
    public static int sumDigits(int[] digits){
        int sum=0;
        for(int d:digits) sum+=d;
        return sum;
    }
    public static double sumSquareDigits(int[] digits){
        double sum=0;
        for(int d:digits) sum+=Math.pow(d,2);
        return sum;
    }
    public static boolean isHarshad(int num,int sum){
        return num%sum==0;
    }

    public static void frequency(int[] digits){
        int[][] freq=new int[10][2];

        for(int i=0;i<10;i++){
            freq[i][0]=i;
        }
        for(int d:digits){
            freq[d][1]++;
        }
        for(int i=0;i<10;i++){
            if(freq[i][1]>0)
            System.out.println(freq[i][0]+" -> "+freq[i][1]);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] digits=storeDigits(num);
        int sum=sumDigits(digits);

        System.out.println("Sum of digits = "+sum);
        System.out.println("Sum of squares = "+sumSquareDigits(digits));
        System.out.println("Harshad Number = "+isHarshad(num,sum));
        
        frequency(digits);
    }
}