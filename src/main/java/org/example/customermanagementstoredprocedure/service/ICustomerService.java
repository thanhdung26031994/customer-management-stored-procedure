package org.example.customermanagementstoredprocedure.service;

import org.example.customermanagementstoredprocedure.model.Customer;

public interface ICustomerService {
    boolean saveWithStoredProcedure(Customer customer);
}
