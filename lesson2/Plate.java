public class Plate {

    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    //добавление еды в миску
    public void addFood(int newFood) {
        this.food=this.food+newFood;
    }
    public void setFood(int newFood) {
        this.food=newFood;
    }
    public int getFood() {
        return this.food;
    }
}
