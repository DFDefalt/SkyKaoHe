package com.kaohe.skykaohe.service;

import com.kaohe.skykaohe.POJO.CustomerAnalysisResult;
import com.kaohe.skykaohe.mapper.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CustomerAnalysisService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerAnalysisResult analyzeCustomers() {
        Map<String, Long> ageAnalysis = customerRepository.getAgeAnalysis();
        Map<String, Long> genderAnalysis = customerRepository.getGenderAnalysis();
        Map<String, Long> regionAnalysis = customerRepository.getRegionAnalysis();

        return new CustomerAnalysisResult(ageAnalysis, genderAnalysis, regionAnalysis);
    }
}
