package com.victor.practice.modul05.task055;

import com.victor.practice.modul05.task051.Room;

import java.util.Arrays;

/**
 * Created by Sonikb on 24.02.2017.
 */
public class DataBase implements DAO {
    private Room[] roomsDB = new Room[0];


    public Room save(Room room) {
        roomsDB = Room.addElementRoomArray(roomsDB, room);
        return room;
    }

    public boolean delete(Room room) {
        for (int i = 0; i < roomsDB.length; i++) {
            Room roomInDb = roomsDB[i];

            if (room.equals(roomInDb)) {

                System.arraycopy(roomsDB, i + 1, roomsDB, i, roomsDB.length - i - 1);

                roomsDB[roomsDB.length - 1] = null;

//                1 2 3 5 6 7 8 9 10 10
//                1 2 3 4 5 6 8 9 null null
            }
        }
        return true;
    }

    public Room update(Room room) {
        return room;
    }

    public Room findById(long id) {
        for (Room room : roomsDB) {
            if (room != null && room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    public Room[] getAll() {
        return roomsDB;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "roomsDB=" + Arrays.toString(roomsDB) +
                '}';
    }
}
