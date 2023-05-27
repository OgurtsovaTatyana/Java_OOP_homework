import java.util.ArrayList;

// a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
// b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
// поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
// c. Для хранения фруктов внутри коробки можно использовать ArrayList;
// d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
// вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
// e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
// подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
// Можно сравнивать коробки с яблоками и апельсинами;
// f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
// Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
// Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
// g. Не забываем про метод добавления фрукта в коробку.
public class programFruct{
public static void main(String[] args) {
Fruit apple1=new Apple();
Fruit apple2=new Apple();
Fruit apple3=new Apple();
Fruit apple4=new Apple();
Fruit orange1=new Orange();
Fruit orange2=new Orange();
Box appleBox1=new Box();
Box appleBox2=new Box();
Box orangeBox1=new Box();
appleBox1.addFruit(apple1);
appleBox1.addFruit(apple2);
appleBox1.addFruit(apple3);
appleBox2.addFruit(apple4);
orangeBox1.addFruit(orange1);
orangeBox1.addFruit(orange2);
// System.out.println(appleBox1);
// System.out.println(orangeBox1);
System.out.println(appleBox1.getWeight()); 
System.out.println(orangeBox1.getWeight()); 
appleBox1.addFruit(orange1);
// System.out.println(appleBox1);
System.out.println(appleBox1.compare(orangeBox1)); 
appleBox1.empty(appleBox2);
appleBox2.empty(orangeBox1);


}
}    
abstract class Fruit{
    protected String nameFruit;
    protected float weight;
  
    
    public Fruit (String nameFruit, float weight){
        this.nameFruit=nameFruit;
        this.weight=weight;
    }
}
class Apple extends Fruit{
    public Apple (){
        super("apple",1.0f);
    }
}
class Orange extends Fruit{
    public Orange (){
        super("orange",1.5f);
    }
}

class Box <T extends Fruit> {
    private ArrayList<T> listBox;    
    private float weight;    
    private String boxName;
    private float boxWeight;   
   
    public Box ( ){
         this.listBox=new ArrayList <T>();
         this.weight=0;

    }
    public void addFruit(T fruit){
        if (weight==0) {
            weight=fruit.weight;
            boxName=String.format("Box with %s", fruit.nameFruit) ;
        }
        if (fruit.weight==weight){
            this.listBox.add(fruit);
        }
        else {
            System.out.printf(" фрукт %s не соответсвует данной коробке:%s \n",fruit.nameFruit,boxName);
        }
    }
    public String getWeight(){
        boxWeight= weight*listBox.size();
    return String.format("weight of %s = %.2f", boxName,  boxWeight);
    }

    public boolean compare(Box<T> tBox){
    return (this.boxWeight==tBox.boxWeight);
    }
    public void empty(Box<T> tBox){
        System.out.println(this.boxName);
        System.out.println(tBox.boxName);
        if (tBox.listBox.get(0).getClass()==this.listBox.get(0).getClass()) {
            tBox.listBox.addAll(this.listBox);
            this.listBox.clear();
            System.out.println("фрукты успешно пересыпаны");
        }
        else {
            System.out.println( "невозможно пересыпать,т.к в коробках разные фрукты");
       }
        }

}


