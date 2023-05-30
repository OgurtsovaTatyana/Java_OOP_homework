package lesson7;

public class Student extends Profession implements Observer {


    public Student(String name) {
        super(name);
        salary = 5000;
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (this.salary < salary){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %f]\n", name, companyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - %f]\n", name, companyName, salary);
        }
    }
}
