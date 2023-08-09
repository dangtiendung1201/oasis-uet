public class CheckingAccount extends Account
{
    public CheckingAccount(long accountNumber, double balance)
    {
        super(accountNumber, balance);
    }

    public void withdraw(double amount) throws BankException
    {
        doWithdrawing(amount);
    }

    public void deposit(double amount) throws BankException
    {
        doDepositing(amount);
    }
}