import java.lang.*;
import java.util.*;

class Compare_str{
    public Boolean compare_charAt (String a , String b){
        Boolean compare = true;

        if (a.length() != b.length())
            compare = false;

        for (int i = 0 ; i < a.length() ; i++){
            if (a.charAt(i) != b.charAt(i))
                compare = false;
        }
        
        return compare;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first String : ");
        String str_1 = scanner.next();
        System.out.print("Enter the second String : ");
        String str_2 = scanner.next();

        Compare_str c1 = new Compare_str();
        Boolean comp_1 = c1.compare_charAt(str_1,str_2);
        Boolean comp_2 = str_1.equals(str_2);

        System.out.println("Compare with charAt() method : " + comp_1);

        System.out.println("Compare using equals() methhod : " + comp_2);
        
        
    }
}