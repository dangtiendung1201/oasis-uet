public class InvalidFundingAmountException extends BankException {
    /**
     * Set exception message.
     */
    public InvalidFundingAmountException(double amount) {
        super("Số tiền không hợp lệ: $" + String.format("%.2f", amount));
    }
}