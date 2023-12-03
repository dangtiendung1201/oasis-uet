public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1201;
    public static final int TYPE_WITHDRAW_CHECKING = 3108;
    public static final int TYPE_DEPOSIT_SAVINGS = 1021;
    public static final int TYPE_WITHDRAW_SAVINGS = 8013;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    /**
     * Constructor with type, amount, initialBalance and finalBalance.
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * Get transaction type string.
     */
    private String getTransactionTypeString(int type) {
        if (type == TYPE_DEPOSIT_CHECKING)
            return "Nạp tiền vãng lai";
        else if (type == TYPE_WITHDRAW_CHECKING)
            return "Rút tiền vãng lai";
        else if (type == TYPE_DEPOSIT_SAVINGS)
            return "Nạp tiền tiết kiệm";
        return "Rút tiền tiết kiệm";
    }

    /**
     * Get transaction summary.
     */
    public String getTransactionSummary() {
        String result = "Kiểu giao dịch: " + getTransactionTypeString(type) + ". Số dư ban đầu: $"
                + String.format("%.02f", initialBalance) + ". Số tiền: $" + String.format("%.02f", amount)
                + ". Số dư cuối: $" + String.format("%.02f", finalBalance) + ".";
        return result;
    }
}
