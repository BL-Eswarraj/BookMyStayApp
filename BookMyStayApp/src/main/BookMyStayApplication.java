package main;

import main.model.Reservation;
import main.service.BookingHistoryService;

public class BookMyStayApplication {

    public static void main(String[] args) {

        BookingHistoryService historyService =
                new BookingHistoryService();

        Reservation reservation1 =
                new Reservation(
                        "Ash",
                        "Single");

        Reservation reservation2 =
                new Reservation(
                        "Brock",
                        "Double");

        Reservation reservation3 =
                new Reservation(
                        "Misty",
                        "Suite");

        historyService.addReservation(
                reservation1);

        historyService.addReservation(
                reservation2);

        historyService.addReservation(
                reservation3);

        historyService.displayBookingHistory();

        historyService.cancelReservation(
                "Brock");

        historyService.displayBookingHistory();

        historyService.generateReport();
    }
}