package com.kaohe.skykaohe.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.HashMap;
import java.util.Map;

public interface CustomerRepository extends JpaRepository {
    @Query("SELECT COUNT(c) FROM Customer c WHERE c.age BETWEEN 18 AND 30")
    long countCustomersBetween18And30();

    @Query("SELECT COUNT(c) FROM Customer c WHERE c.age BETWEEN 31 AND 45")
    long countCustomersBetween31And45();

    @Query("SELECT COUNT(c) FROM Customer c WHERE c.age > 45")
    long countCustomersAbove45();

    @Query("SELECT COUNT(c) FROM Customer c WHERE c.gender = 'MALE'")
    long countMaleCustomers();

    @Query("SELECT COUNT(c) FROM Customer c WHERE c.gender = 'FEMALE'")
    long countFemaleCustomers();

    @Query("SELECT COUNT(c) FROM Customer c WHERE c.region = 'North'")
    long countCustomersInNorth();

    @Query("SELECT COUNT(c) FROM Customer c WHERE c.region = 'South'")
    long countCustomersInSouth();

    @Query("SELECT COUNT(c) FROM Customer c WHERE c.region = 'East'")
    long countCustomersInEast();

    @Query("SELECT COUNT(c) FROM Customer c WHERE c.region = 'West'")
    long countCustomersInWest();

    @Query("SELECT COUNT(c) FROM Customer c WHERE c.region = 'Central'")
    long countCustomersInCentral();

    default Map<String, Long> getAgeAnalysis() {
        Map<String, Long> ageAnalysis = new HashMap<>();
        ageAnalysis.put("18-30", countCustomersBetween18And30());
        ageAnalysis.put("31-45", countCustomersBetween31And45());
        ageAnalysis.put("45+", countCustomersAbove45());
        return ageAnalysis;
    }

    default Map<String, Long> getGenderAnalysis() {
        Map<String, Long> genderAnalysis = new HashMap<>();
        genderAnalysis.put("Male", countMaleCustomers());
        genderAnalysis.put("Female", countFemaleCustomers());
        return genderAnalysis;
    }

    default Map<String, Long> getRegionAnalysis() {
        Map<String, Long> regionAnalysis = new HashMap<>();
        regionAnalysis.put("North", countCustomersInNorth());
        regionAnalysis.put("South", countCustomersInSouth());
        regionAnalysis.put("East", countCustomersInEast());
        regionAnalysis.put("West", countCustomersInWest());
        regionAnalysis.put("Central", countCustomersInCentral());
        return regionAnalysis;
    }
}