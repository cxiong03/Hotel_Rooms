package com.codewithchang;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String hotelName;
    private int hotelRooms;
    private List<StandardRoom> availableStandardRooms;
    private List<StandardRoom> reservedStandardRooms;
    private List<SuiteRoom> availableSuites;
    private List<SuiteRoom> reservedSuites;
    private List<Client> hotelClients;
    private Client client;

    public Hotel(String hotelName, int hotelRooms) {
        this.hotelName = hotelName;
        this.hotelRooms = hotelRooms;
        this.availableStandardRooms = new ArrayList<StandardRoom>();
        this.reservedStandardRooms = new ArrayList<StandardRoom>();
        this.availableSuites = new ArrayList<SuiteRoom>();
        this.reservedSuites = new ArrayList<SuiteRoom>();
        this.hotelClients = new ArrayList<Client>();
    }

    public boolean addRoom(StandardRoom availableRoom) {
        if(this.availableStandardRooms.contains(availableRoom) &&
                this.reservedStandardRooms.contains(availableRoom) || this.hotelRooms == 0) {
//            System.out.println("Room " + availableRoom.getRoomNumber() + " is already available. Or hotel is at capacity.");
            return false;
        }
        this.hotelRooms--;
        return this.availableStandardRooms.add(availableRoom);
    }

    public boolean addRoom(SuiteRoom availableSuiteRoom) {
        if(this.availableSuites.contains(availableSuiteRoom) &&
                this.reservedSuites.contains(availableSuiteRoom) || this.hotelRooms == 0) {
            return false;
        }
        this.hotelRooms--;
        return this.availableSuites.add(availableSuiteRoom);
    }

    public boolean reserveRoom(StandardRoom reservedRoom, Client client) {
        if(this.availableStandardRooms.contains(reservedRoom)) {
            int index = availableStandardRooms.indexOf(reservedRoom);
            StandardRoom standardRoom = availableStandardRooms.get(index);
            this.hotelClients.add(client);
            availableStandardRooms.remove(standardRoom);
            return reservedStandardRooms.add(standardRoom);
        }
        System.out.println("Room is already reserved.");
        return false;
    }

    public boolean reserveRoom(SuiteRoom reservedRoom, Client client) {
        if(this.availableSuites.contains(reservedRoom)) {
            int index = availableSuites.indexOf(reservedRoom);
            SuiteRoom suiteRoom = availableSuites.get(index);
            this.hotelClients.add(client);
            availableSuites.remove(suiteRoom);
            return reservedSuites.add(suiteRoom);
        }
        System.out.println("Room is already reserved.");
        return false;
    }

    public void checkoutRoom(StandardRoom room, Client client) {
        // make sure room is reserve to checkout
        // client has to match room
        // Add price check functionality
        if(this.reservedStandardRooms.contains(room)) {
            int index = availableStandardRooms.indexOf(room);
            StandardRoom standardRoom = reservedStandardRooms.get(index);
            if(standardRoom.getOccupant().equals(client)) {
                this.reservedStandardRooms.remove(standardRoom);
                standardRoom.checkout();
                this.availableStandardRooms.add(standardRoom);
                System.out.println("You have checked out. Thanks for staying with " + this.hotelName + "!");
            } else {
                System.out.println("This is not your room.");
            }
        } else {
            System.out.println("This room is not reserved.");
        }
    }
}
