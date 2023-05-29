package lesson6.task1_Order;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        InputOrder inputOrder =new InputOrder();
        SaveOrder saveOrder= new SaveOrder();
        inputOrder.inputFromConsole(order);
        saveOrder.saveToJson(order);
    }  
}
