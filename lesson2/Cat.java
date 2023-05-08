public class Cat {
    
    private String name;
    private int appetite;
    private boolean satiety=false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(int food, Object plate) { 
        if (!this.satiety && this.appetite<=food) {
           this.satiety=true; 
           System.out.printf("кот %s покушал \n",name); 
           ((Plate)plate).setFood(food - this.getAppetite());
        }
        else {
            if (!this.satiety && this.appetite>=food) {
                System.out.printf("кот %s остался голодным, еды не хватило \n",name); 
            }
            else {
                System.out.printf("кот %s не поел,он уже сыт \n",name); 
            }
        }
        
    }
    public int getAppetite() {
       return this.appetite; 
    }
}
