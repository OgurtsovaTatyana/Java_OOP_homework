package lesson7;

public class Admin extends Profession implements Observer {

    public Admin(String name) {
        super(name);
        salary = 50000;
        typeProfession="Admin";
    }

    @Override
    public void receiveOffer(JobVacancy jobVacancy) {
        if (this.salary < jobVacancy.salary){
            System.out.printf("Администратор %s >>> Мне нужна эта работа! [%s - %f] текущая зарплата: %f \n", name, jobVacancy.companyName,jobVacancy.salary, salary);
            this.salary = jobVacancy.salary;
        }
        else {
            System.out.printf("Администратор %s >>> Я найду работу получше! [%s - %f] текущая зарплата: %f \n", name, jobVacancy.companyName,jobVacancy.salary, salary);
        }
    }
}
