package com.itvdn.javaEssential.ex_005_class_object_hash_code;

public class Main {
    public static void main(String[] args) {
        // створюємо об'єкти, 2 з них містять однакові параметри
        Car car1 = new Car(12);
        Car car2 = new Car(12);
        Car car3 = new Car(15);

        // викликаємо метод hashCode, яким буде результат?
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
