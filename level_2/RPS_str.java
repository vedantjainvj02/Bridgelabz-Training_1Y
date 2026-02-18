import java.util.*;

class RPS_str {

    public String computerChoice() {

        int num = (int)(Math.random() * 3);
        if (num == 0) return "Rock";
        if (num == 1) return "Paper";
        return "Scissors";
    }

    public String findWinner(String user, String comp) {

        if (user.equals(comp))
            return "Draw";

        if ((user.equals("Rock") && comp.equals("Scissors")) || (user.equals("Paper") && comp.equals("Rock")) || (user.equals("Scissors") && comp.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RPS_str obj = new RPS_str();
        System.out.print("Enter number of games: ");
        int n = scanner.nextInt();
        scanner.next();

        int userWins = 0, compWins = 0;

        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("------------------------------------------------");

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter choice (Rock/Paper/Scissors): ");
            String user = scanner.nextLine();
            String comp = obj.computerChoice();
            String winner = obj.findWinner(user, comp);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;
            System.out.println(i + "\t" + user + "\t" + comp + "\t\t" + winner);
        }

        double userPercent = (userWins * 100.0) / n;
        double compPercent = (compWins * 100.0) / n;

        System.out.println("\nUser Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("User Win %: " + userPercent);
        System.out.println("Computer Win %: " + compPercent);

    }
}
