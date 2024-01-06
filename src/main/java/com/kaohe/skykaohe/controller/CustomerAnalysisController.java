package com.kaohe.skykaohe.controller;

import com.kaohe.skykaohe.POJO.CustomerAnalysisResult;
import com.kaohe.skykaohe.service.CustomerAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerAnalysisController {
    @Autowired
    private CustomerAnalysisService customerAnalysisService;

    @GetMapping("/analysis")
    public ResponseEntity<CustomerAnalysisResult> getCustomerAnalysis() {
        CustomerAnalysisResult analysis = customerAnalysisService.analyzeCustomers();
        return new ResponseEntity<>(analysis, HttpStatus.OK);
    }
}
