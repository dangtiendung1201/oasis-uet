public class Transaction {
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    private String operation;
    private double amount;
    private double balance;

    /**
     * Constructor with operation, amount and balance.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Get operation.
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Get amount.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Get balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Set operation.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Set amount.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Set balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}