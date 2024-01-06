package com.kaohe.skykaohe.controller;

import com.kaohe.skykaohe.POJO.ProductAnalysisResult;
import com.kaohe.skykaohe.service.ProductAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductAnalysisController {
    @Autowired
    private ProductAnalysisService productAnalysisService;

    @GetMapping("/analysis")
    public ResponseEntity<ProductAnalysisResult> getProductAnalysis() {
        ProductAnalysisResult analysis = productAnalysisService.analyzeProducts();
        return new ResponseEntity<>(analysis, HttpStatus.OK);
    }
}
