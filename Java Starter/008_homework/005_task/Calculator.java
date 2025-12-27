import java.util.Scanner;

//Завдання 5
//
//Використовуючи IntelliJ IDEA, створіть клас Calculator. Створіть метод з ім'ям calculate, який приймає як параметри
// три цілочислові значення та повертає значення кожного аргументу, поділеного на 5.
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть три цілочислові значення: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        calculate(a, b, c);
    }

    private static void calculate(int i, int i1, int i2) {
        System.out.println("Перше число " + i + " ділене на 5 має результат: " + i / 5 +
                "\nДруге число " + i1 + " ділене на 5 має результат: " + i1 / 5 +
                "\nТретє число " + i2 + " ділене на 5 має результат: " + i2 / 5);
    }
}
