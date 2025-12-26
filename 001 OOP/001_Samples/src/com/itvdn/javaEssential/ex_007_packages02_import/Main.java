package com.itvdn.javaEssential.ex_007_packages02_import;

import com.itvdn.javaEssential.ex_001_class_declaration.Car;

public class Main {
    public static void main(String[] args) {
        // Якщо клас (Машина) лежить в іншому пакеті, то щоб його використовувати в Класі Main - його треба імпортувати
        Car myCar = new Car();
    }
}
