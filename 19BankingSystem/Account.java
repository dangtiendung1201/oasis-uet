import java.util.List;
import java.util.ArrayList;
public abstract class Account {
    public final String CHECKING = "CHECKING";
    public final String SAVINGS = "SAVINGS";

    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList;

    public Account()
    {
        accountNumber = 0;
        balance = 0;
        transactionList = new ArrayList<Transaction>();
    }

    public Account(long accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        transactionList = new ArrayList<Transaction>();
    }

    public long getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public abstract void withdraw(double amount) throws BankException;
    public abstract void deposit(double amount) throws BankException;

    public void doWithdrawing(double amount) throws BankException
    {
        if (amount <= 0)
            throw new InvalidFundingAmountException(amount);
        if (amount > balance)
            throw new InsufficientFundsException(accountNumber, amount);
        balance -= amount;
    }

    public void doDepositing(double amount) throws BankException
    {
        if (amount <= 0)
            throw new InvalidFundingAmountException(amount);
        balance += amount;
    }

    public String getTransactionHistory()
    {
        String result = "Lịch sử giao dịch của tài khoản " + accountNumber + ":\n";
        for (Transaction transaction : transactionList)
        {
            result += transaction.getTransactionSummary() + "\n";
        }
        return result;
    }

    public void addTransaction(Transaction transaction)
    {
        transactionList.add(transaction);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Account)
        {
            Account account = (Account)obj;
            return accountNumber == account.accountNumber;
        }
        return false;
    }
}
