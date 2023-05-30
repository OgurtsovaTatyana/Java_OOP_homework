package lesson7;

public class Master extends Profession implements Observer  {

    public Master(String name) {
        super(name);
        salary = 80000;
        typeProfession ="Master";
    }

    @Override
    public void receiveOffer(JobVacancy jobVacancy) {
        if (this.salary < jobVacancy.salary){
            System.out.printf("Мастер %s >>> Мне нужна эта работа! [%s - %f] текущая зарплата: %f \n", name, jobVacancy.companyName,jobVacancy.salary, salary);
            this.salary = jobVacancy.salary;
        }
        else {
            System.out.printf("Мастер %s >>> Я найду работу получше! [%s - %f] текущая зарплата: %f \n", name, jobVacancy.companyName,jobVacancy.salary, salary);
        }
    }
}
