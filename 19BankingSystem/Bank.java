import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private List<Customer> customerList;

    /**
     * Default constructor.
     */
    public Bank() {
        customerList = new ArrayList<Customer>();
    }

    /**
     * Check if line contain account info.
     */
    private boolean checkAccountLine(String[] lines) {
        if (lines[0].length() == 10) {
            return true;
        }

        return false;
    }

    /**
     * Read customer list from input stream.
     */
    public void readCustomerList(InputStream inputStream) {
        customerList = new ArrayList<Customer>();
        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splited = line.split(" ");

                if (checkAccountLine(splited)) {
                    long idNumber = Long.parseLong(splited[0]);
                    String type = splited[1];
                    double balance = Double.parseDouble(splited[2]);

                    if (type.equals("CHECKING")) {
                        Account account = new CheckingAccount(idNumber, balance);

                        for (Customer customer : customerList) {
                            if (customer.getIdNumber() == idNumber) {
                                customer.addAccount(account);
                            }
                        }
                    } else if (type.equals("SAVINGS")) {
                        Account account = new SavingsAccount(idNumber, balance);

                        for (Customer customer : customerList) {
                            if (customer.getIdNumber() == idNumber) {
                                customer.addAccount(account);
                            }
                        }
                    }
                } else {
                    long idNumber = Long.parseLong(splited[splited.length - 1]);
                    String fullName = "";

                    for (int i = 0; i < splited.length - 1; i++) {
                        fullName += splited[i] + " ";
                    }

                    Customer customer = new Customer(idNumber, fullName);
                    customerList.add(customer);

                }
            }
        }
    }

    /**
     * Get customer info by name.
     */
    public String getCustomersInfoByNameOrder() {
        for (int i = 0; i < customerList.size(); i++) {
            for (int j = i + 1; j < customerList.size(); j++) {
                if (customerList.get(i).getFullName().compareTo(customerList.get(j).getFullName()) > 0) {
                    Customer temp = customerList.get(i);
                    customerList.set(i, customerList.get(j));
                    customerList.set(j, temp);
                }
            }
        }

        String result = "";
        for (Customer customer : customerList) {
            result += customer.getCustomerInfo() + "\n";
        }

        return result;
    }

    /**
     * Get customer info by id number.
     */
    public String getCustomersInfoByIdOrder() {
        for (int i = 0; i < customerList.size(); i++) {
            for (int j = i + 1; j < customerList.size(); j++) {
                if (customerList.get(i).getIdNumber() > customerList.get(j).getIdNumber()) {
                    Customer temp = customerList.get(i);
                    customerList.set(i, customerList.get(j));
                    customerList.set(j, temp);
                }
            }
        }

        String result = "";
        for (Customer customer : customerList) {
            result += customer.getCustomerInfo() + "\n";
        }

        return result;
    }

    /**
     * Get customer list
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }
}