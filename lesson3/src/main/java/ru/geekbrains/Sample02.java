//package ru.geekbrains;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Sample02 {

    private static Random random = new Random();

    /**
     * TODO: 2. generateEmployee должен создавать различных сотрудников (Worker, Freelancer)
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(200, 300);
        int index = random.nextInt(30, 50);
        int age= random.nextInt(25, 60);
        int typeWork=random.nextInt(2);
System.out.println(typeWork);
       if (typeWork>0) return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], age, salary * index);
       else return new Freelancer (names[random.nextInt(10)], surnames[random.nextInt(10)],age, salary * index);
    }

    public static void main(String[] args) {

        // Worker worker = new Worker("Анатолий", "Шестаков", 80000);
        // System.out.println(worker);

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
            employees[i] = generateEmployee();

        for (Employee employee : employees){
            System.out.println(employee);
        }
        Arrays.sort(employees, new AgeComparator());
        //Arrays.sort(employees, new SalaryComparator());
       // Arrays.sort(employees, new NameComparator());
       // Arrays.sort(employees);

        System.out.printf("\n*** Отсортированный массив сотрудников ***\n\n");

        for (Employee employee : employees){
            System.out.println(employee);
        }

    }

}

class SalaryComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {

        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        return Double.compare(o1.calculateSalary(), o2.calculateSalary());
       
    }
}
class AgeComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {

        return Integer.compare(o1.age, o2.age);
       
    }
}
class NameComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.name.compareTo(o2.name);
        // if (res == 0){
        //     res = Double.compare( o2.calculateSalary(), o1.calculateSalary());
        // }
        return res;
    }
}

abstract class Employee implements Comparable<Employee>{

    protected String name;
    protected String surName;
    protected int age;
    protected double salary;
    

    public Employee(String name, String surName, int age, double salary) {
        this.name = name;
        this.surName = surName;
        this.age=age;
        this.salary = salary;
        
    }

    public abstract  double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; возраст: %d; Среднемесячная заработная плата: %.2f", name, surName,age, salary);
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare( calculateSalary(), o.calculateSalary());
    }
}

class Worker extends Employee{

    public Worker(String name, String surName,int age, double salary) {
        super(name, surName,age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary ;
        //TODO: Для фрилансера - return 20 * 5 * salary
    }

    @Override
    public String toString() {
        return String.format("%s %s; возраст: %d; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)", name, surName, age,salary);
    }
}

/**
 * TODO: 1. Доработать самостоятельно в рамках домашней работы
 */
class Freelancer extends Employee{

    public Freelancer(String name, String surName,int age, double salary) {
        super(name, surName,age, salary);
    }

    @Override
    public double calculateSalary() {
        return 20 * salary;
    }
    @Override
    public String toString() {
        return String.format("%s %s;возраст: %d; Фрилансер; Заработная плата (Почасовая оплата): %.2f (руб.)", name, surName,age, salary);
    }
}