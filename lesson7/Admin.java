package lesson7;

public class Admin extends Profession implements Observer {

    public Admin(String name) {
        super(name);
        salary = 50000;
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (this.salary < salary){
            System.out.printf("Администратор %s >>> Мне нужна эта работа! [%s - %f]\n", name, companyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Администратор %s >>> Я найду работу получше! [%s - %f]\n", name, companyName, salary);
        }
    }
}
