public class CheckingAccount extends Account {
    /**
     * Default constructor.
     */
    public CheckingAccount() {
        super();
    }

    /**
     * Constructor with accountNumber and balance.
     */
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Withdraw.
     */
    public void withdraw(double amount) {
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
        try {
            doDepositing(amount);
        } catch (InsufficientFundsException | InvalidFundingAmountException e) {
            e.printStackTrace();
        }
    }
}