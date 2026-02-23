package com.itvdn.javaEssential.ex007_override;

/**
 * Поліморфізм.
 */
public class DerivedClass extends BaseClass {
    // Перевизначення методу базового класу.

    @Override
    public void method() {
        System.out.println("method from DerivedClass");
    }
}
