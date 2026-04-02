package com.itvdn.javaEssential.ex_002_class_object_methods;

public class Car {
    // створюємо поля
    private int speed;
    private String color;

    // конструктор
    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    // методи доступу
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // перезаписуємо метод toString класу Object тому що ми вважаємо потрібно

    @Override
    public String toString() {
        return String.format("Speed is: %s\nColor is: %s", speed, color);
    }

    // спочатку він виглядає як вказано нижче і повертає місце, яке займає об'єктом у пам'яті

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
