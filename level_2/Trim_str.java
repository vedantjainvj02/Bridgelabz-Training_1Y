import java.util.*;

class Trim_str{

    public int[] findIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ')
            start++;
        while (end >= start && str.charAt(end) == ' ')
            end--;

        return new int[]{start, end};
    }

    public String createSubstring(String str, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    public boolean compare(String a, String b) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String text = scanner.nextLine();

        Trim_str obj = new Trim_str();
        int[] indexes = obj.findIndexes(text);
        String userTrim = obj.createSubstring(text, indexes[0], indexes[1]);
        String builtInTrim = text.trim();

        boolean result = obj.compare(userTrim, builtInTrim);

        System.out.println("User Trim: '" + userTrim + "'");
        System.out.println("Built-in Trim: '" + builtInTrim + "'");
        System.out.println("Are both same? " + result);
    }
}
