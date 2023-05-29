package ru.geekbrains.lesson5.models;

import ru.geekbrains.lesson5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {


    private Collection<Table> tables;

    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
        //throw new RuntimeException("Некорректный номер столика");
    }
    /**
     * TODO: Разработать самостоятельно
     * Поменять бронь столика
     * @param oldReservation номер старого резерва (для снятия)
     * @param reservationDate дата резерва столика
     * @param tableNo номер столика
     * @param name Имя
     */
// удаляется старая запись брони и создается новая
    public int СhangeReservationTable (int oldReservation, Date reservationDate, int tableNo, String name){
        for (Table table : tables) {
                for(Reservation item: table.getReservations()){
                    if (item.getId() == oldReservation) {
                        table.getReservations().remove(item);
                        break;
                    }
                }                
        }
        return reservationTable(reservationDate, tableNo, name);
    }



}