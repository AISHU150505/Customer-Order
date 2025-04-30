package com.aishu.customer_orders.repository;

import com.aishu.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Aishwarya S
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
