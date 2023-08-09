public class SavingsAccount extends Account
{
    public SavingsAccount(long accountNumber, double balance)
    {
        super(accountNumber, balance);
    }

    public void withdraw(double amount) throws BankException
    {
        if (amount > balance)
            throw new InsufficientFundsException(accountNumber, amount);
        if (amount > 1000)
            throw new InvalidFundingAmountException(amount);
        doWithdrawing(amount);
    }

    public void deposit(double amount) throws BankException
    {
        if (amount > 5000)
            throw new InvalidFundingAmountException(amount);
        doDepositing(amount);
    }
}