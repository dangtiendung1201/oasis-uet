import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList;

    /**
     * Default constructor.
     */
    public Account() {
        accountNumber = 0;
        balance = 0;
        transactionList = new ArrayList<Transaction>();
    }

    /**
     * Constructor with accountNumber and balance.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        transactionList = new ArrayList<Transaction>();
    }

    /**
     * Get account number.
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Get balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Withdraw.
     */
    public abstract void withdraw(double amount);

    /**
     * Deposit.
     */
    public abstract void deposit(double amount);

    /**
     * Do withdrawing.
     */
    public void doWithdrawing(double amount) {
        if (amount <= 0)
            throw new InvalidFundingAmountException(amount);
        if (amount > balance)
            throw new InsufficientFundsException(accountNumber, amount);

        if (this instanceof SavingsAccount) {
            Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS, amount, balance,
                    balance - amount);
            transactionList.add(transaction);
        } else {
            Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_CHECKING, amount, balance,
                    balance - amount);
            transactionList.add(transaction);
        }

        balance -= amount;
    }

    /**
     * Do depositing.
     */
    public void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount <= 0)
            throw new InvalidFundingAmountException(amount);

        if (this instanceof SavingsAccount) {
            Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS, amount, balance,
                    balance + amount);
            transactionList.add(transaction);
        } else {
            Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_CHECKING, amount, balance,
                    balance + amount);
            transactionList.add(transaction);
        }

        balance += amount;
    }

    /**
     * Get transaction history.
     */
    public String getTransactionHistory() {
        String result = "Lịch sử giao dịch của tài khoản " + accountNumber + ":\n";
        for (Transaction transaction : transactionList) {
            result += transaction.getTransactionSummary() + "\n";
        }
        return result;
    }

    /**
     * Add transaction.
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * Equals.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account account = (Account) obj;
            return accountNumber == account.accountNumber;
        }
        return false;
    }
}