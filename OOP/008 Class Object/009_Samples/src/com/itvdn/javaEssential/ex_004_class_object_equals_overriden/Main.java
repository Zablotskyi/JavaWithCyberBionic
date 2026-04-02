package com.itvdn.javaEssential.ex_004_class_object_equals_overriden;

public class Main {
    public static void main(String[] args) {
        // створюємо об'єкти з однаковими параметрами

        Car car1 = new Car(2);
        Car car2 = new Car(2);
        Car car3 = car1;

        // метод equals порівнює вже за інструкцією, яку ми описали у перезаписаному методі порівнюваного класу
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
    }
}
