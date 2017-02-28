package com.victor.practice.modul05.task054;

import com.victor.practice.modul05.task051.Room;
import com.victor.practice.modul05.task053.API;

import java.util.Date;

/**
 * Created by Sonikb on 24.02.2017.
 */
public class GoogleAPI implements API {
    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        rooms[0] = new Room(6, 1000, 2, new Date(117, 1, 25, 17, 0), "Lybid", "Kiev");
        rooms[1] = new Room(7, 1550, 2, new Date(117, 2, 15, 12, 0), "Hayal", "Kiev");
        rooms[2] = new Room(8, 4000, 4, new Date(117, 3, 19, 9, 30), "Hilton", "Kiev");
        rooms[3] = new Room(9, 2700, 3, new Date(117, 1, 5, 11, 30), "Royal", "Odessa");
        rooms[4] = new Room(10, 2000, 2, new Date(117, 4, 11, 11, 30), "Ukraina", "Odessa");
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] resultFindArray = new Room[0];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName().equals(city) && rooms[i].getHotelName().equals(hotel)) {
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