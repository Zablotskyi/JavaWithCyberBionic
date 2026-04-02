package com.itvdn.javaEssential.ex_001_class_object.declaration;

// клас Car неявно успадкує клас Object

public class Main {
    public static void main(String[] args) {
        // Створили об'єкт класу Car. В нього вже є методи класу Object.
        Main main = new Main();

        // об'єкт класу Car також має методи класу Object
        Car car = new Car();
    }
}

// клас Car явно успадковується від класу Object
class Car extends Object {
}
