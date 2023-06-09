package lesson7;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>(); // соискатели работы


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Реализация рассылки сообщений
     * @param nameCompany
     * @param salary
     */
    @Override
    public void sendOffer(JobVacancy jobVacancy) {
        for (Observer observer : observers){
            observer.receiveOffer(jobVacancy);//отправить предложение наблюдателю nameCompany, salary
        }
    }
}
