package com.codewithchang;

public class Room {
    private String roomNumber;
    private String roomType;
    private String floor;
    private boolean isOccupied = false;
    private boolean needsCleaning = false;
    private Client occupant;
    private double averagePrice = 38000;



    public Room(String roomNumber, String roomType, String floor) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.floor = floor;
    }

    public boolean reserve(Client guest) {
        this.isOccupied = true;
        this.occupant = guest;
        occupant.setCurrentBill(this.averagePrice);
        if (this.isOccupied && !this.needsCleaning) {
            System.out.println("Unavailable");
        } else {
            System.out.println("Room is Reserved");
            return true;
        }
        return false;
    }

    public void checkout() {
        this.occupant = null;
        this.isOccupied = false;
        this.needsCleaning = true;
        System.out.println();
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

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isNeedsCleaning() {
        return needsCleaning;
    }

    public void setNeedsCleaning(boolean needsCleaning) {
        this.needsCleaning = needsCleaning;
    }

    public Client getOccupant() {
        return occupant;
    }

    public void setOccupant(Client occupant) {
        this.occupant = occupant;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }
}
