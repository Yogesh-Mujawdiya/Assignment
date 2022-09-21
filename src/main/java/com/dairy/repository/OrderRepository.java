package com.dairy.repository;

import com.dairy.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Query(value = "select sum(o.quantity*p.productPrice) from Order o, Product p where p.id=o.productId")
    Float getTotalSale();

}