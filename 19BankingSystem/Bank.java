import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Bank
{
    private List<Customer> customerList;

    public void CustomerList(InputStream inputStream)
    {
        customerList = new ArrayList<Customer>();
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            if (parts[0].length() == 10)
            {
                long idNumber = Long.parseLong(parts[0]);
                String type = parts[1];
                double balance = Double.parseDouble(parts[2]);

                if (type.equals("CHECKING"))
                {
                    CheckingAccount account = new CheckingAccount(idNumber, balance);
                    for (Customer customer : customerList)
                    {
                        if (customer.getIdNumber() == idNumber)
                        {
                            customer.addAccount(account);
                        }
                    }
                }
                else if (type.equals("SAVINGS"))
                {
                    SavingsAccount account = new SavingsAccount(idNumber, balance);
                    for (Customer customer : customerList)
                    {
                        if (customer.getIdNumber() == idNumber)
                        {
                            customer.addAccount(account);
                        }
                    }
                }
            }
            else
            {
                long idNumber = Long.parseLong(parts[parts.length - 1]);
                String fullName = "";
                for (int i = 0; i < parts.length - 1; i++)
                {
                    fullName += parts[i] + " ";
                }
                Customer customer = new Customer(idNumber, fullName);
                customerList.add(customer);

            }
        }
    }

    public String getCustomerInfoByNameOrder()
    {
        // sort customerList by name
        // return customerList.toString();
        for (int i = 0; i < customerList.size(); i++)
        {
            for (int j = i + 1; j < customerList.size(); j++)
            {
                if (customerList.get(i).getFullName().compareTo(customerList.get(j).getFullName()) > 0)
                {
                    Customer temp = customerList.get(i);
                    customerList.set(i, customerList.get(j));
                    customerList.set(j, temp);
                }
            }
        }

        String result = "";
        for (Customer customer : customerList)
        {
            result += customer.getCustomerInfo() + "\n";
        }

        return result;
    }

    public String getCustomersInfoByIdOrder()
    {
        for (int i = 0; i < customerList.size(); i++)
        {
            for (int j = i + 1; j < customerList.size(); j++)
            {
                if (customerList.get(i).getIdNumber() > customerList.get(j).getIdNumber())
                {
                    Customer temp = customerList.get(i);
                    customerList.set(i, customerList.get(j));
                    customerList.set(j, temp);
                }
            }
        }

        String result = "";
        for (Customer customer : customerList)
        {
            result += customer.getCustomerInfo() + "\n";
        }

        return result;
    }
}