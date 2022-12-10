package com.skill.bills.entity;

import javax.persistence.*;

@Entity
@Table(name = "Seller", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String storeName;
    private String contactNo;
    private String altContactNo;
    private String address;
    private String email;
    private String panNo;
    private String gstNo;
    private String tinNo;
    private String productCategory;
    private String offeringConditionType;
    private String productTaxCode;
    private String paymentType;
    private String shipmentType;
    private String supplierName;
    private String supplierContactNo;
    private String bestTimeToContact;
    private String sellingPreferenceTime;
    private String billingCycle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAltContactNo() {
        return altContactNo;
    }

    public void setAltContactNo(String altContactNo) {
        this.altContactNo = altContactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getGstNo() {
        return gstNo;
    }

    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }

    public String getTinNo() {
        return tinNo;
    }

    public void setTinNo(String tinNo) {
        this.tinNo = tinNo;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getOfferingConditionType() {
        return offeringConditionType;
    }

    public void setOfferingConditionType(String offeringConditionType) {
        this.offeringConditionType = offeringConditionType;
    }

    public String getProductTaxCode() {
        return productTaxCode;
    }

    public void setProductTaxCode(String productTaxCode) {
        this.productTaxCode = productTaxCode;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierContactNo() {
        return supplierContactNo;
    }

    public void setSupplierContactNo(String supplierContactNo) {
        this.supplierContactNo = supplierContactNo;
    }

    public String getBestTimeToContact() {
        return bestTimeToContact;
    }

    public void setBestTimeToContact(String bestTimeToContact) {
        this.bestTimeToContact = bestTimeToContact;
    }

    public String getSellingPreferenceTime() {
        return sellingPreferenceTime;
    }

    public void setSellingPreferenceTime(String sellingPreferenceTime) {
        this.sellingPreferenceTime = sellingPreferenceTime;
    }

    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }
}
