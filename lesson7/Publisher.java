package lesson7;

public interface Publisher {

    void registerObserver(Observer observer); // создание соискателя

    void removeObserver(Observer observer); //удалить соискателя

    void sendOffer(JobVacancy jobVacancy);// предложение о работе 

}
