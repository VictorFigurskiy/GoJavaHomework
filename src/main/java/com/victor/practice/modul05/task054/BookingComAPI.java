package com.victor.practice.modul05.task054;

import com.victor.practice.modul05.task051.Room;
import com.victor.practice.modul05.task053.API;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Sonikb on 24.02.2017.
 */
public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(1, 1000, 2, new Date(117, 1, 25, 17, 0), "Lybid", "Kiev");
        rooms[1] = new Room(2, 1500, 3, new Date(117, 2, 15, 12, 0), "Lybid", "Kiev");
        rooms[2] = new Room(3, 3000, 4, new Date(117, 3, 10, 9, 30), "Hilton", "Kiev");
        rooms[3] = new Room(4, 2700, 3, new Date(117, 1, 8, 9, 30), "Royal", "Odessa");
        rooms[4] = new Room(5, 3000, 4, new Date(117, 4, 13, 11, 30), "Ukraina", "Kiev");
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] resultFindArray = new Room[0];
        Room room = new Room(0,price,persons,null,hotel,city);

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room) && rooms[i].getHotelName().equals(hotel)) {
                resultFindArray = Room.addElementRoomArray(resultFindArray, rooms[i]);
            }
        }
        return resultFindArray;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public Room[] getAllRooms() {
        return rooms;

    }
}
