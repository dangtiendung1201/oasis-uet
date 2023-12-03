public class SavingsAccount extends Account {
    private static double withdrawLimit = 1000;
    private static double depositLimit = 5000;

    /**
     * Default constructor.
     */
    public SavingsAccount() {
        super();
    }

    /**
     * Constructor with accountNumber and balance.
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Withdraw.
     */
    public void withdraw(double amount) {
        if (amount > withdrawLimit)
            throw new InvalidFundingAmountException(amount);

        try {
            doWithdrawing(amount);
        } catch (InsufficientFundsException | InvalidFundingAmountException e) {
            e.printStackTrace();
        }
    }

    /**
     * Deposit.
     */
    public void deposit(double amount) {
        if (amount > depositLimit)
            throw new InvalidFundingAmountException(amount);

        try {
            doDepositing(amount);
        } catch (InsufficientFundsException | InvalidFundingAmountException e) {
            e.printStackTrace();
        }
    }
}