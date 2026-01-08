package com.itvdn.javaEssential.ex_005_constructors.private_constructor;

public class Animal {
    private int age;

    // оголошений конструктор є приватним. Може бути використаний лише в рамках цього класу
    private Animal(int age) {
        this.age = age;
    }
}