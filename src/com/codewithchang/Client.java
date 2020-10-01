package com.codewithchang;

public class Client {
    private String name;
    private int partySize = 1;
    private double currentBill;
    private int prepaid;
    private String phoneNumber = "555-555-5555";
    private String roomNumber = "302";
    private String roomType = "double";

    public Client(String name, double currentBill, int prepaid) {
        this.name = name;
        this.currentBill = currentBill;
        this.prepaid = prepaid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String updatedName) {
        this.name = updatedName;
    }

    public void setCurrentBill(double updatedPrice) {
        this.currentBill = updatedPrice;
    }

}
