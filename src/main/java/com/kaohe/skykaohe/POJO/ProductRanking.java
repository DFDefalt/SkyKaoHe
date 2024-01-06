package com.kaohe.skykaohe.POJO;

import lombok.Data;

@Data
public class ProductRanking {
    private String productName;
    private long orderCount;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(long orderCount) {
        this.orderCount = orderCount;
    }

    public ProductRanking(String productName, long orderCount) {
        this.productName = productName;
        this.orderCount = orderCount;
    }
}
