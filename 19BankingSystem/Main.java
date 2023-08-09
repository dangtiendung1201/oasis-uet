public class Main
{
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account = new CheckingAccount(123456789, 1000);
        Customer customer = new Customer(123, "hihi");
        customer.addAccount(account);
        System.out.println(customer.getCustomerInfo());
    }
}