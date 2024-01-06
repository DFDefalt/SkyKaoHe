package com.kaohe.skykaohe.controller;

import com.kaohe.skykaohe.POJO.OrderAnalysisResult;
import com.kaohe.skykaohe.service.OrderAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderAnalysisController {
    @Autowired
    private OrderAnalysisService orderAnalysisService;

    @GetMapping("/analysis")
    public ResponseEntity<OrderAnalysisResult> getOrderAnalysis() {
        OrderAnalysisResult analysis = orderAnalysisService.analyzeOrders();
        return new ResponseEntity<>(analysis, HttpStatus.OK);
    }
}
