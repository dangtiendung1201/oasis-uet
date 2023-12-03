import java.util.List;
import java.util.ArrayList;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList;

    /**
     * Default constructor.
     */
    public Customer() {
        idNumber = 0;
        fullName = "";
        accountList = new ArrayList<Account>();
    }

    /**
     * Constructor with idNumber and fullName.
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        accountList = new ArrayList<Account>();
    }

    /**
     * Get customer info.
     */
    public String getCustomerInfo() {
        String result = "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
        return result;
    }

    /**
     * Add account to account list.
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * Remove account from account list.
     */
    public void removeAccount(Account account) {
        accountList.removeIf(accountItem -> accountItem.getAccountNumber() == account.getAccountNumber());
    }

    /**
     * Get ID.
     */
    public long getIdNumber() {
        return idNumber;
    }

    /**
     * Set ID.
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Get name.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Set name.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Get account list.
     */
    public List<Account> getAccountList() {
        return accountList;
    }
}