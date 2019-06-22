package org.mycompany.dao;

import org.mycompany.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomers();
    public void saveCustomer(Customer customer);

    Customer getCustomers(int id);

    void deleteCustomer(int id);
}
