package com.kaohe.skykaohe.service;

import com.kaohe.skykaohe.POJO.OrderAnalysisResult;
import com.kaohe.skykaohe.mapper.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderAnalysisService {
    @Autowired
    private OrderRepository orderRepository;

    public OrderAnalysisResult analyzeOrders() {
        long totalOrders = orderRepository.count();
        long totalProductsOrdered = orderRepository.getTotalProductsOrdered();
        long uniqueUsers = orderRepository.countUniqueUsers();
        long cancelledOrders = orderRepository.countCancelledOrders();
        long refundedOrders = orderRepository.countRefundedOrders();

        return new OrderAnalysisResult(totalOrders, totalProductsOrdered, uniqueUsers, cancelledOrders, refundedOrders);
    }
}
