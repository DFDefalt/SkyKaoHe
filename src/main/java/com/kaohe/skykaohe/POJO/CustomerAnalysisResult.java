package com.kaohe.skykaohe.POJO;

import lombok.Data;

import java.util.Map;

@Data
public class CustomerAnalysisResult {
    private Map<String, Long> ageAnalysis;
    private Map<String, Long> genderAnalysis;
    private Map<String, Long> regionAnalysis;

    public Map<String, Long> getAgeAnalysis() {
        return ageAnalysis;
    }

    public void setAgeAnalysis(Map<String, Long> ageAnalysis) {
        this.ageAnalysis = ageAnalysis;
    }

    public Map<String, Long> getGenderAnalysis() {
        return genderAnalysis;
    }

    public void setGenderAnalysis(Map<String, Long> genderAnalysis) {
        this.genderAnalysis = genderAnalysis;
    }

    public Map<String, Long> getRegionAnalysis() {
        return regionAnalysis;
    }

    public void setRegionAnalysis(Map<String, Long> regionAnalysis) {
        this.regionAnalysis = regionAnalysis;
    }

    public CustomerAnalysisResult(Map<String, Long> ageAnalysis, Map<String, Long> genderAnalysis, Map<String, Long> regionAnalysis) {
        this.ageAnalysis = ageAnalysis;
        this.genderAnalysis = genderAnalysis;
        this.regionAnalysis = regionAnalysis;
    }
}
