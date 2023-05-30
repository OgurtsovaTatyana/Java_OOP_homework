package lesson7;

abstract class Profession {
    protected  String name;
    protected double salary;
    protected String typeProfession;
    public Profession(String name) {
        this.name = name;
    }
    public void receiveOffer(JobVacancy jobVacancy) {
            if (this.typeProfession.equals(jobVacancy.typeProfession)){
                if (this.salary < jobVacancy.salary){
                    System.out.printf(" %s %s >>> Мне нужна эта работа! [%s: %s - %f] текущая зарплата: %f\n",typeProfession, name, jobVacancy.companyName,jobVacancy.typeProfession, jobVacancy.salary, salary);
                    this.salary = jobVacancy.salary;
                }
                else {
                    System.out.printf("%s %s >>> Я найду работу получше! [%s: %s - %f] текущая зарплата: %f\n",typeProfession, name, jobVacancy.companyName,jobVacancy.typeProfession,jobVacancy.salary, salary);
                }
            }
            else {System.out.printf("%s %s >>> данная работа не подходит мне по  профессии! [%s: %s - %f] текущая зарплата: %f\n",typeProfession, name, jobVacancy.companyName,jobVacancy.typeProfession,jobVacancy.salary, salary);
            }
        }
        
}
