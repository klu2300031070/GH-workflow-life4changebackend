package com.kelf.devops.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.*;

@Entity
public class BloodDonor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, length = 12)
    private String addhar;

    @Column(nullable = false, length = 10)
    private String phoneno;

    @Column(nullable = false)
    private String bloodType;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String org;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private Double weight;

    @Column(nullable = false)
    private Double height;

    @Column(nullable = false)
    private String currentDonationDate; 

    @Column(nullable = false)
    private Boolean eligibleToDonate = true;

    @Column(length = 500)
    private String ineligibilityReason;

    @Transient
    private Long daysSinceLastDonation;

    @PrePersist
    public void setCurrentDate() {
        if (currentDonationDate == null) {
            currentDonationDate = LocalDate.now()
                    .format(DateTimeFormatter.ISO_DATE); // "2026-04-18"
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddhar() {
        return addhar;
    }

    public void setAddhar(String addhar) {
        this.addhar = addhar;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getCurrentDonationDate() {
        return currentDonationDate;
    }

    public void setCurrentDonationDate(String currentDonationDate) {
        this.currentDonationDate = currentDonationDate;
    }

    public Boolean getEligibleToDonate() {
        return eligibleToDonate;
    }

    public void setEligibleToDonate(Boolean eligibleToDonate) {
        this.eligibleToDonate = eligibleToDonate;
    }

    public String getIneligibilityReason() {
        return ineligibilityReason;
    }

    public void setIneligibilityReason(String ineligibilityReason) {
        this.ineligibilityReason = ineligibilityReason;
    }

    public Long getDaysSinceLastDonation() {
        return daysSinceLastDonation;
    }

    public void setDaysSinceLastDonation(Long daysSinceLastDonation) {
        this.daysSinceLastDonation = daysSinceLastDonation;
    }
}