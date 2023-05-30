package lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company implements CreateVacancy{

    private Random random; // множитель зарплаты
    private String nameCompany;
    private double maxSalary; // макс зарплата
    private Publisher jobAgency; //агенство Publisher- интерфейс
    private String [] ListProfession =new String []{"Администратор","Student","Master"} ;
    
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
    

    @Override
    public JobVacancy createJobVacancy() {
        JobVacancy jobVacancy =new JobVacancy();
        double salary = random.nextDouble(3000, maxSalary);
        jobVacancy.companyName=nameCompany;
        jobVacancy.salary=salary;
        jobVacancy.typeProfession=ListProfession[random.nextInt(2)];
        return jobVacancy;
        }

    public void needEmployee(){  //предложение о вакансии
        jobAgency.sendOffer(createJobVacancy());
    }

}
