package com.kaohe.skykaohe.POJO;

import lombok.Data;

import java.util.List;

@Data
public class ProductAnalysisResult {
    private List productRankingList;
    private long totalOrders;
    private long totalProductsOrdered;
    private long cancelledProducts;
    private long refundedProducts;

    public List getProductRankingList() {
        return productRankingList;
    }

    public void setProductRankingList(List productRankingList) {
        this.productRankingList = productRankingList;
    }

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

    public long getCancelledProducts() {
        return cancelledProducts;
    }

    public void setCancelledProducts(long cancelledProducts) {
        this.cancelledProducts = cancelledProducts;
    }

    public long getRefundedProducts() {
        return refundedProducts;
    }

    public void setRefundedProducts(long refundedProducts) {
        this.refundedProducts = refundedProducts;
    }

    public ProductAnalysisResult(List productRankingList, long totalOrders, long totalProductsOrdered, long cancelledProducts, long refundedProducts) {
        this.productRankingList = productRankingList;
        this.totalOrders = totalOrders;
        this.totalProductsOrdered = totalProductsOrdered;
        this.cancelledProducts = cancelledProducts;
        this.refundedProducts = refundedProducts;
    }
}
