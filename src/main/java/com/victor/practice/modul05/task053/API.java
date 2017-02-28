package com.victor.practice.modul05.task053;

import com.victor.practice.modul05.task051.Room;

/**
 * Created by Sonikb on 24.02.2017.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAllRooms();
}

