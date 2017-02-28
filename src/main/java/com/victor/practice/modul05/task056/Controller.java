package com.victor.practice.modul05.task056;

import com.victor.practice.modul05.task051.Room;
import com.victor.practice.modul05.task053.API;
import com.victor.practice.modul05.task054.BookingComAPI;
import com.victor.practice.modul05.task054.GoogleAPI;
import com.victor.practice.modul05.task054.TripAdvisorAPI;
import com.victor.practice.modul05.task055.DataBase;

/**
 * Created by Sonikb on 24.02.2017.
 */
public class Controller {
    private API[] apis = new API[3];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room[] find1 = apis[0].findRooms(price, persons, city, hotel);
        Room[] find2 = apis[1].findRooms(price, persons, city, hotel);
        Room[] find3 = apis[2].findRooms(price, persons, city, hotel);

        Room[] resultArray = concatArrays((concatArrays(find1, find2)), find3);

        return resultArray;
    }

    public Room[] check(API api1, API api2) {
        Room[] checkedArray = new Room[0];

        for (Room room : api1.getAllRooms()) {
            for (Room room1 : api2.getAllRooms()) {
                if (room.equals(room1)) {
                    checkedArray = Room.addElementRoomArray((Room.addElementRoomArray(checkedArray, room)), room1);
                }
            }
        }
        return checkedArray;
    }

    public static Room[] concatArrays(Room[] array1, Room[] array2) {
        if (array1 == null) {
            return array2;
        }
        if (array2 == null) {
            return array1;
        }
        Room[] concatArray = new Room[array1.length + array2.length];

        System.arraycopy(array1, 0, concatArray, 0, array1.length);
        System.arraycopy(array2, 0, concatArray, array1.length, array2.length);

        return concatArray;
    }

    public API[] getApis() {
        return apis;
    }

    DataBase useDAO = new DataBase();

    public Room save(Room room) {
        return useDAO.save(room);
    }

    public boolean delete(Room room) {
        useDAO.delete(room);
        return true;
    }

    public Room update(Room room) {
        return useDAO.update(room);
    }

    public Room findById(long id) {
        return useDAO.findById(id);
    }
}
