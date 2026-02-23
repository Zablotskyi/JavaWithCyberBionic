package com.itvdn.javaEssential.ex001_inheritance;

/**
 * Успадкування.
 */
public class DerivedClass extends BaseClass {
    // Конструктор.
    public DerivedClass() {
        // Змінюємо всі доступні поля успадковані від базового класу.
        publicField = "DerivedClass.publicField";
        protectedField = "DerivedClass.protectedField";
    }
}
