package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;
import ru.geekbrains.lesson5.models.TableModel;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;
    private Collection<Table> tables;

    public BookingPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    /**
     * Загрузить список всех столиков
     */
    public void loadTables(){
        if (tables == null){
            tables = model.loadTables();
        }
    }

    /**
     * Отобразить список столиков
     */
    public void updateView(){
        view.showTables(tables);
    }

    /**
     * Отобразить результат бронирования столика
     * @param reservationNo номер брони
     */
    private void updateReservationStatusView(int reservationNo,int tableNo, String name){
        view.showReservationStatus(reservationNo,tableNo, name);
    }
    private void CangeReservationStatusView(int reservationNo,int tableNo, String name){
        view.showCangeReservationStatus(reservationNo, tableNo, name); 
    }

    /**
     * Получили уведомление о попытке бронирования столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = model.reservationTable(orderDate, tableNo, name);
        updateReservationStatusView(reservationNo,tableNo,name);
    }
    @Override
    public void onСhangeReservationTable (int oldReservation, Date reservationDate, int tableNo, String name){
         int reservationNo = model.СhangeReservationTable (oldReservation,reservationDate,tableNo,name);
         CangeReservationStatusView( reservationNo, tableNo,  name);

       
    }
}
