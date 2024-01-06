package com.kaohe.skykaohe.POJO;

import lombok.Data;

@Data
public class OrderAnalysisResult {
    private long totalOrders;
    private long totalProductsOrdered;
    private long uniqueUsers;
    private long cancelledOrders;
    private long refundedOrders;

    public long getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(long totalOrders) {
        this.totalOrders = totalOrders;
    }

    public long getTotalProductsOrdered() {
        return totalProductsOrdered;
    }

    public void setTotalProductsOrdered(long totalProductsOrdered) {
        this.totalProductsOrdered = totalProductsOrdered;
    }

    public long getUniqueUsers() {
        return uniqueUsers;
    }

    public void setUniqueUsers(long uniqueUsers) {
        this.uniqueUsers = uniqueUsers;
    }

    public long getCancelledOrders() {
        return cancelledOrders;
    }

    public void setCancelledOrders(long cancelledOrders) {
        this.cancelledOrders = cancelledOrders;
    }

    public long getRefundedOrders() {
        return refundedOrders;
    }

    public void setRefundedOrders(long refundedOrders) {
        this.refundedOrders = refundedOrders;
    }

    public OrderAnalysisResult(long totalOrders, long totalProductsOrdered, long uniqueUsers, long cancelledOrders, long refundedOrders) {
        this.totalOrders = totalOrders;
        this.totalProductsOrdered = totalProductsOrdered;
        this.uniqueUsers = uniqueUsers;
        this.cancelledOrders = cancelledOrders;
        this.refundedOrders = refundedOrders;
    }
}
