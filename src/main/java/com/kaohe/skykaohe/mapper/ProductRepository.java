package com.kaohe.skykaohe.mapper;

import com.kaohe.skykaohe.POJO.ProductRanking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository {
    @Query("SELECT new com.example.ProductRanking(p.name, COUNT(oi.order.id)) FROM Product p JOIN p.orderItems oi GROUP BY p.id ORDER BY COUNT(oi.order.id) DESC")
    List<ProductRanking> getProductRanking();

    @Query("SELECT COUNT(DISTINCT oi.order.id) FROM OrderItem oi")
    long getTotalOrders();

    @Query("SELECT SUM(oi.quantity) FROM OrderItem oi")
    long getTotalProductsOrdered();

    @Query("SELECT COUNT(oi) FROM OrderItem oi WHERE oi.order.status = 'CANCELLED'")
    long getCancelledProducts();

    @Query("SELECT COUNT(oi) FROM OrderItem oi WHERE oi.order.status = 'REFUNDED'")
    long getRefundedProducts();
}
