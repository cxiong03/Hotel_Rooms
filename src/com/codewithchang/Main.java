package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        Hotel myHotel = new Hotel("Hotel Java", 20);
        Client Chang = new Client("Chang", 88.00, 50.00);
	    StandardRoom room1 = new StandardRoom("103", "single", "first floor",
                "single", 12, 1);
        myHotel.addRoom(room1);
	    myHotel.reserveRoom(room1, Chang);

    }
}
