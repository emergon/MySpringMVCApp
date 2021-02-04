package emergon.service;

import emergon.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private List<Customer> customers;

    public List<Customer> getCustomers() {
        if (customers == null) {
            customers = new ArrayList();
            customers.add(new Customer(1, "Jack"));
            customers.add(new Customer(2, "Jonathan"));
            customers.add(new Customer(3, "Jenny"));
        }
        return customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void deleteCustomer(int id) {
        for(Customer c: customers){
            if(c.getCcode().equals(id)){
                customers.remove(c);
                break;
            }
        }
    }

    public Customer getCustomerById(int ccode) {
        for(Customer c: customers){
            if(c.getCcode() == ccode){
                return c;
            }
        }
        return null;
    }
}
