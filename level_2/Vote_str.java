import java.util.*;

class Vote_str {

    public int[] getAges(int n, Scanner sc) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i+1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    public String[][] checkVote(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0)
                result[i][1] = "Invalid Age";
            else if (ages[i] >= 18)
                result[i][1] = "Can Vote";
            else
                result[i][1] = "Cannot Vote";
        }

        return result;
    }

    public void display(String[][] data) {

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Vote_str obj = new Vote_str();
        int[] ages = obj.getAges(10, scanner);
        String[][] result = obj.checkVote(ages);
        obj.display(result);
    }
}
