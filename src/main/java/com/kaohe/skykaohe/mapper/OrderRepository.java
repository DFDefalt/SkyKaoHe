package com.kaohe.skykaohe.mapper;

import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("SELECT COUNT(DISTINCT o.user.id) FROM Order o")
    long countUniqueUsers();

    @Query("SELECT COUNT(o) FROM Order o WHERE o.status = 'CANCELLED'")
    long countCancelledOrders();

    @Query("SELECT COUNT(o) FROM Order o WHERE o.status = 'REFUNDED'")
    long countRefundedOrders();

    @Query("SELECT SUM(oi.quantity) FROM OrderItem oi")
    long getTotalProductsOrdered();
}