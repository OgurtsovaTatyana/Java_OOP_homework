package lesson7;

public interface Publisher {

    void registerObserver(Observer observer); // создание соискателя

    void removeObserver(Observer observer); //удалить соискателя

    void sendOffer(String nameCompany, double salary);// предложение о работе 

}
