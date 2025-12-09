//Завдання 4
//    Використовуючи IntelliJ IDEA, створіть проєкт із класом Hello.java, який виведе в консоль рядок «Hello YOUR_NAME».
//    Скомпілюйте його через консоль за допомогою команди javac. Виконайте скомпільований файл Hello.class через консоль.

public class HelloWithConsole {
    public static void main(String[] args) {
        String name = "Vasyl";
        System.out.println("Hello " + name);
    }
    // in console write:
    // javac HelloWithConsole.java - компіляція файлу
    // java HelloWithConsole - запускаємо файл
}
