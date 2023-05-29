package ru.geekbrains.lesson5.views;

import ru.geekbrains.lesson5.models.Table;
import ru.geekbrains.lesson5.presenters.View;
import ru.geekbrains.lesson5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {


    private ViewObserver observer;


    /**
     * Отобразить список столиков
     * @param tables список столиков
     */
    public void showTables(Collection<Table> tables){
        for (Table table: tables){
            System.out.println(table);
        }
    }

    /**
     * Отобразить результат бронирования
     * @param reservationNo номер брони
     * @param tableNo номер столика
     * @param name имя бронирующего
     */
    @Override
    public void showReservationStatus(int reservationNo,int tableNo, String name) {
        if (reservationNo > 0){
            System.out.printf("Столик #%d успешно забронирован на имя '%s'. Номер брони: #%d\n",tableNo, name, reservationNo);
        }
        else {
            System.out.println("Ошибка бронирования столика.");
        }
    }
    /**
     * Отобразить результат изменения бронирования
     * @param reservationNo номер брони
     */
    @Override
    public void showCangeReservationStatus(int reservationNo,int tableNo, String name) {
        if (reservationNo > 0){
            System.out.printf("Бронирование успешно изменено, на вас '%s'забронирован столик #%d. Номер брони: #%d\n",name,tableNo,reservationNo);
        }
        else {
            System.out.println("Ошибка изменения бронирования столика.");
        }
    }
    /**
     * Установить наблюдателя
     * @param observer наблюдатель (презентер)
     */
    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования),
     * бронирование столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public void reservationTable(Date orderDate, int tableNo, String name){
        observer.onReservationTable(orderDate, tableNo, name);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param oldReservation идентификатор бронирования (старый)
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        //TODO: Обратиться к наблюдателю, указать на процедуру изменения бронирования столика
        observer.onСhangeReservationTable(oldReservation, reservationDate,tableNo, name);
    }



}
