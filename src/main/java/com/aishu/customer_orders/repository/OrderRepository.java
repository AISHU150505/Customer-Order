package com.aishu.customer_orders.repository;

import com.aishu.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Aishwarya S
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
