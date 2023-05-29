package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;

import java.util.Collection;

public interface View {

    /**
     * Отобразить список всех столиков
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    void showReservationStatus(int reservationNo,int tableNo, String name);
    void showCangeReservationStatus(int reservationNo,int tableNo, String name);

    /**
     * Установить нового наблюдателя
     * @param observer наблюдатель (презентер)
     */
    void setObserver(ViewObserver observer);


}
