package lesson7;

import java.util.Random;

public class Company {

    private Random random; // множитель зарплаты
    private String nameCompany;
    private double maxSalary; // макс зарплата

    private Publisher jobAgency; //агенство Publisher- интерфейс

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    /**
     * TODO: Доработать метод, компания должна генерировать объект "Вакансия" и передавать
     *  объект в агенство.
     * Поиск сотрудника
     */
    public void needEmployee(){  //запрос на вакансию
        double salary = random.nextDouble(3000, maxSalary);
        jobAgency.sendOffer(nameCompany, salary);
    }

}
