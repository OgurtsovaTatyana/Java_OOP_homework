package lesson7;

public class Student extends Profession implements Observer {


    public Student(String name) {
        super(name);
        salary = 5000;
        typeProfession ="Студент";
    }

    // @Override
    // public void receiveOffer(JobVacancy jobVacancy) {
    //     if (this.salary < jobVacancy.salary){
    //         System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %f]текущая зарплата: %f \n", name, jobVacancy.companyName,jobVacancy.salary, salary);
    //         this.salary = jobVacancy.salary;
    //     }
    //     else {
    //         System.out.printf("Студент %s >>> Я найду работу получше! [%s - %f]текущая зарплата: %f \n", name, jobVacancy.companyName,jobVacancy.salary, salary);
    //     }
    // }
}
