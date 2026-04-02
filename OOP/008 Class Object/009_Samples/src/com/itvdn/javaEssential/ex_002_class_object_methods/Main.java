package com.itvdn.javaEssential.ex_002_class_object_methods;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(160, "blue");

        // повертає  клас об'єкту
        System.out.println(car.getClass());

        // завдяки перезаписаному методу toString виведе інформацію в потрібному нам вигляді
        System.out.println(car);
    }
}
