public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    public Transaction(int type, double amount, double initialBalance, double finalBalance)
    {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    private String getTransactionTypeString(int type)
    {
        if (type == TYPE_DEPOSIT_CHECKING) return "Nạp tiền vãng lai";
        else if (type == TYPE_WITHDRAW_CHECKING) return "Rút tiền vãng lai";
        else if (type == TYPE_DEPOSIT_SAVINGS) return "Nạp tiền tiết kiệm";
        return "Rút tiền tiết kiệm";

    }

    public String getTransactionSummary()
    {
        String result = "Kiểu giao dịch: " + getTransactionTypeString(type) + ". Số dư ban đầu: $" + String.format("%.02f", initialBalance) + ". Số tiền: $" + String.format("%.02f", amount) + ". Số dư cuối: $" + String.format("%.02f", finalBalance) + ".";
        return result;
    }

    public String getType()
    {
        return getTransactionTypeString(type);
    }

    public double getAmount()
    {
        return amount;
    }

    public double getInitialBalance()
    {
        return initialBalance;
    }

    public double getFinalBalance()
    {
        return finalBalance;
    }
}
