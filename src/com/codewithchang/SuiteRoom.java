package com.codewithchang;

public class SuiteRoom extends Room{
    private String suite;
    private int rooms;
    private int beds;
    private boolean kitchenette;
    private boolean needsRestock = false;

    public SuiteRoom(String roomNumber, String roomType, String floor, String suite, int rooms, int beds,
                     boolean kitchenette, boolean needsRestock) {
        super(roomNumber, roomType, floor);
        this.suite = suite;
        this.rooms = rooms;
        this.beds = beds;
        this.kitchenette = kitchenette;
        this.needsRestock = needsRestock;
    }

    @Override
    public boolean reserve(Client guest) {
        if(this.needsRestock) {
            System.out.println("Needs to be restock");
            return false;
        }
        return super.reserve(guest);
    }

    @Override
    public void checkout() {
        this.needsRestock = true;
        super.checkout();
    }

    public String getSuite() {
        return this.suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public int getRooms() {
        return this.rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBeds() {
        return this.beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public boolean getKitchenette() {
        return this.kitchenette;
    }

    public void setKitchenette(boolean kitchenette) {
        this.kitchenette = kitchenette;
    }

    public boolean getNeedsRestock() {
        return this.needsRestock;
    }

    public void restock() {
        if(this.needsRestock)
            // theoretically we have restock the kitchenette
            this.needsRestock = false; // now it is restock
        else
            System.out.println("Does not need to be restock.");
    }
}
