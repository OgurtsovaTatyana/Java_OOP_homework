package lesson7;

public class Master extends Profession implements Observer  {

    public Master(String name) {
        super(name);
        salary = 80000;
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (this.salary < salary){
            System.out.printf("Мастер %s >>> Мне нужна эта работа! [%s - %f]\n", name, companyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Мастер %s >>> Я найду работу получше! [%s - %f]\n", name, companyName, salary);
        }
    }
}
