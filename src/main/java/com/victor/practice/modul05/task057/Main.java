package com.victor.practice.modul05.task057;

import com.victor.practice.modul05.task051.Room;
import com.victor.practice.modul05.task054.BookingComAPI;
import com.victor.practice.modul05.task054.GoogleAPI;
import com.victor.practice.modul05.task054.TripAdvisorAPI;
import com.victor.practice.modul05.task055.DataBase;
import com.victor.practice.modul05.task056.Controller;

/**
 * Created by Sonikb on 24.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Room[] requestRoomsArray = controller.requstRooms(1000, 2, "Kiev", "Lybid");
        for (Room room : requestRoomsArray) {
            System.out.println(room);
        }

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        Room[] checkRoomsArray = controller.check(new BookingComAPI(), new TripAdvisorAPI());
        for (Room room : checkRoomsArray) {
            System.out.println(room);
        }

        System.out.println("\n===================================================\n");

        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        DataBase dataBase = new DataBase();

        for (Room room : bookingComAPI.getAllRooms()) {
            System.out.println(controller.save(room));
        }

        for (Room room : googleAPI.getAllRooms()) {
            System.out.println(controller.save(room));
        }

        System.out.println("\n++++++++++++++++++++++++++++++++++\n");

        System.out.println(controller.delete(googleAPI.getAllRooms()[1]));

        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");

        System.out.println(controller.findById(3));

    }
}
