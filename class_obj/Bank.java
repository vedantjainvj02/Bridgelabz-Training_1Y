class Bank {
    String accountHolder;
    int accountNumber;
    double balance;

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        Bank acc = new Bank();

        acc.accountHolder = "Vedant";
        acc.accountNumber = 12345;
        acc.balance = 10000;

        acc.deposit(2000);
        acc.withdraw(5000);
        acc.displayBalance();
    }
}