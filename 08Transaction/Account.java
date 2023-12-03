import java.util.ArrayList;

public class Account {
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();
    private double balance;

    /**
     * Print transaction details.
     */
    public void printTransaction() {
        int cnt = 1;

        for (Transaction transaction : transitionList) {
            System.out.print("Giao dich " + cnt + ": ");

            if (transaction.getOperation().equals(Transaction.DEPOSIT)) {
                System.out.print("Nap tien $");
            } else {
                System.out.print("Rut tien $");
            }

            System.out.print(String.format("%.2f", transaction.getAmount()) + ". ");

            System.out.print("So du luc nay: $" + String.format("%.2f",
                    transaction.getBalance()) + ".\n");

            cnt++;
        }
    }

    /**
     * Make a deposit.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;

            transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
        }
    }

    /**
     * Make a withdraw.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;

            transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
        }
    }

    /**
     * Add a new transaction.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Main.
     */
    public static void main(String[] args) {
        Account account = new Account();

        account.addTransaction(2000.255, Transaction.DEPOSIT);
        account.addTransaction(1000, Transaction.WITHDRAW);

        account.printTransaction();
    }
}
