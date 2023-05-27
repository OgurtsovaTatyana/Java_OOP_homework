//import java.util.ArrayList; //ошибка The import java.util.ArrayList cannot be resolved

//Принципы ООП Абстракция и интерфейсы. Пример проектирования

public class Main {
 
  public static void main(String[] args) {  
  
    Cat cat1 = new Cat("Barsik", 25);
    Cat cat3 = new Cat("Rubby", 10);
    Cat cat2 = new Cat("Dustin", 30);       
    Cat cat4 = new Cat("Luky", 15);
    Plate plate = new Plate(50);
    plate.info();
    Cat[] arrCats = new Cat[]{cat1, cat2, cat3, cat4};
//     ArrayList<Cat>  arrCats = new ArrayList<Cat>(); //ошибка The import java.util.ArrayList cannot be resolved
//     cats.add(cat);
//     cats.add(cat2);
//     cats.add(cat3);
//     cats.add(cat4);

       for (Cat cat : arrCats) {
        //cat.eat(plate.getFood(),plate);
       } 
//cat3.eat(plate.getFood(),plate);
      plate.info();
    }  
}
