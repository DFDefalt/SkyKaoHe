package com.kaohe.skykaohe.service;

import com.kaohe.skykaohe.POJO.ProductAnalysisResult;
import com.kaohe.skykaohe.POJO.ProductRanking;
import com.kaohe.skykaohe.mapper.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductAnalysisService {
    @Autowired
    private ProductRepository productRepository;

    public ProductAnalysisResult analyzeProducts() {
        List<ProductRanking> productRankingList = productRepository.getProductRanking();
        long totalOrders = productRepository.getTotalOrders();
        long totalProductsOrdered = productRepository.getTotalProductsOrdered();
        long cancelledProducts = productRepository.getCancelledProducts();
        long refundedProducts = productRepository.getRefundedProducts();

        return new ProductAnalysisResult(productRankingList, totalOrders, totalProductsOrdered, cancelledProducts, refundedProducts);
    }
}
