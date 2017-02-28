package com.victor.practice.modul05.task055;

import com.victor.practice.modul05.task051.Room;

/**
 * Created by Sonikb on 24.02.2017.
 */
public interface DAO {
    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    Room[] getAll();
}
