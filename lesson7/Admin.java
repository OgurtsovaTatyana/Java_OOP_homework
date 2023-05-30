package lesson7;

public class Admin extends Profession implements Observer {

    public Admin(String name) {
        super(name);
        salary = 50000;
        typeProfession="Администратор";
    }

    // @Override
    // public void receiveOffer(JobVacancy jobVacancy) {
    //     if (this.typeProfession.equals(jobVacancy.typeProfession)){
    //     if (this.salary < jobVacancy.salary){
    //         System.out.printf(" %s %s >>> Мне нужна эта работа! [%s: %s - %f] текущая зарплата: %f \n",typeProfession, name, jobVacancy.companyName,jobVacancy.typeProfession, jobVacancy.salary, salary);
    //         this.salary = jobVacancy.salary;
    //     }
    //     else {
    //         System.out.printf("%s %s >>> Я найду работу получше! [%s: %s - %f] текущая зарплата: %f \n",typeProfession, name, jobVacancy.companyName,jobVacancy.typeProfession,jobVacancy.salary, salary);
    //     }
    // }
    // else {System.out.printf("%s %s >>> данная работа не подходит мне по  профессии! [%s: %s - %f] текущая зарплата: %f \n",typeProfession, name, jobVacancy.companyName,jobVacancy.typeProfession,jobVacancy.salary, salary);}
    // }
}
