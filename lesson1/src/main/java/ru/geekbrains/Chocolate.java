package ru.geekbrains;

public class Chocolate extends Product {
    private int calory;
    private String type;
    private int weight;

    public int getCalory() {
        return calory;
    }
    public String getType() {
        return type;
    }
    public int getWeight() {
        return weight;
    }
    public Chocolate(String name, double price, int calory, String type, int weight){
        super(name, price);
        this.calory = calory;
        this.type = type;
        this.weight = weight;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s %s - %f - : %d каллории: %d ",name,type, price, calory, weight);

    }
}

