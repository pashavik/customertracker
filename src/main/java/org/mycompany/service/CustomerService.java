package org.mycompany.service;

import org.mycompany.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();
    public void saveCustomer(Customer customer);

    Customer getCustomers(int id);

    void deleteCustomer(int id);
}
