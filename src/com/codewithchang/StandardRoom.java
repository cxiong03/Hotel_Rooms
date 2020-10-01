package com.codewithchang;

public class StandardRoom extends Room{
    private String type;
    private int amountOfRooms;
    private int amountOfBeds;

    public StandardRoom(String roomNumber, String roomType, String floor, String type, int amountOfRooms, int amountOfBeds) {
        super(roomNumber, roomType, floor);
        this.type = type;
        this.amountOfRooms = amountOfRooms;
        this.amountOfBeds = amountOfBeds;
    }

    @Override
    public boolean reserve(Client guest) {
        if(guest.getPartySize() > amountOfBeds * 2) {
            System.out.println("Unavailable");
            return false;
        }
        return super.reserve(guest);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmountOfRooms() {
        return amountOfRooms;
    }

    public void setAmountOfRooms() {
        this.amountOfRooms = amountOfRooms;
    }

    public int getAmountOfBeds() {
        return amountOfBeds;
    }

    public void setAmountOfBeds() {
        this.amountOfBeds = amountOfBeds;
    }
}
