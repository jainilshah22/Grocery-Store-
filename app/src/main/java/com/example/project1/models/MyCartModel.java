package com.example.project1.models;

import java.io.Serializable;

public class MyCartModel implements Serializable {

    String productName,currentData,currentTime,totalQuantity;
    int productPrice;
    int totalPrice;
    String documentId;

    public MyCartModel() {
    }

    public MyCartModel(String productName, int productPrice, String currentData, String currentTime, String totalQuantity, int totalPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.currentData = currentData;
        this.currentTime = currentTime;
        this.totalQuantity = totalQuantity;
        this.totalPrice = totalPrice;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return String.valueOf(productPrice);
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getCurrentData() {
        return currentData;
    }

    public void setCurrentData(String currentData) {
        this.currentData = currentData;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(String totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
