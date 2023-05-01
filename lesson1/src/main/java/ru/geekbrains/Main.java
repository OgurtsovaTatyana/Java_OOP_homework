package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Product product2 = new Product("Бутылка с молоком", 200);
        Product product3 = new Product("Ок", "11", -100);
        BottleOfWater bottleOfWater1 = new BottleOfWater("Вода", 100, 2);
        BottleOfWater bottleOfWater2 = new BottleOfWater("Вода1", 100, 2);
        BottleOfWater bottleOfWater3 = new BottleOfWater("Вода2", 110, 1);
        BottleOfWater bottleOfWater4 = new BottleOfWater("Вода3", 130, 3);
        BottleOfWater bottleOfWater5 = new BottleOfWater("Вода4", 100, 1);
        Product bottleOfMilk1 = new BottleOfMilk("Молоко", 100, 2, 10);

        Product chocolate1 =new Chocolate("Шоколад", 50.0,300,"Молочный",200);
        Product chocolate2 =new Chocolate("Шоколад", 70.0,200,"Горький",200);

        List<Product> products = new ArrayList<>();
        products.add(product2);
        products.add(product3);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);        
        products.add(bottleOfWater5);
        products.add(chocolate1);
        products.add(chocolate2);

//печать списка продуктов
        for (Product item : products) {
            System.out.println(item.displayInfo());
        }
        
        VendingMachine machine = new VendingMachine(products);

        BottleOfWater bottleOfWaterRes =  machine.getBottleOfWater("Вода3", 3);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");

        }
        Chocolate chocolateRes =  machine.getChocolate("Шоколад", 200);
        if (chocolateRes != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateRes.displayInfo());
        }
        else {
            System.out.println("Такого товара нет в автомате.");
        }
    }


}