package com.itvdn.javaEssential.ex_003_class_object_default_equals;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1);
        Car car2 = new Car(2);
        Car car3 = car1;

        // порівнюємо за посиланнями (різні об'єкти)
        System.out.println(car1.equals(car2));

        // посилаємось на один і той самий об'єкт
        System.out.println(car1.equals(car3));

        System.out.println(car1 == car2);

        System.out.println(car1 == car3);
    }
}
