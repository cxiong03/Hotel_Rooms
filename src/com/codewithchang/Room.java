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

    private int add(int i, int j) {
        return i + j;
    }

    public int add2(int i, int j) {
        return add(i,j);
    }

}
