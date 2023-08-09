public class InsufficientFundsException extends BankException {
    public InsufficientFundsException(long accountNumber, double amount) {
        super("Số dư không đủ để rút $" + String.format("%.2f", amount) + " để thực hiện giao dịch");
    }
}