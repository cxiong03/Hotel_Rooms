package com.codewithchang;

public class Client {
    private String name;
    private int partySize = 1;
    private double currentBill;
    private double prepaid;
    private String phoneNumber = "555-555-5555";
    private String roomNumber = "302";
    private String roomType = "double";

    public Client(String name, double currentBill, double prepaid) {
        this.name = name;
        this.currentBill = currentBill;
        this.prepaid = prepaid;
    }

    public void makePayment(int increasePayment) {
        this.prepaid += increasePayment;
    }

    public void chargeRoom(int chargeRoom) {
        this.currentBill += chargeRoom;
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

    public int getPartySize() {
        return this.partySize;
    }

    public double getPrepaid() {
        return prepaid;
    }

    public void setPrepaid(int prepaid) {
        this.prepaid = prepaid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getOutstanding() {
        return currentBill - prepaid;
    }
}
