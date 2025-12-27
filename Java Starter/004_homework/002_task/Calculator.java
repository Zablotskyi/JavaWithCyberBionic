import java.util.Scanner;

// Завдання 2
//
//Використовуючи IntelliJ IDEA, створіть клас Calculator.
//
//Напишіть програму «Консольний калькулятор».
//
//Створіть дві змінні з іменами operand1 та operand2. Вкажіть змінним деякі довільні значення. Запропонуйте користувачу
// ввести арифметичний знак. Прийміть значення, введене користувачем та помістіть його у рядкову змінну sign.
//
//Для організації вибору алгоритму обчислювального процесу використовуйте перемикач switch. Виведіть на екран результат
// виконання арифметичної операції.
//
//У разі використання операції ділення, організуйте перевірку спроби ділення на нуль. І якщо така є, то скасуйте
// виконання арифметичної операції та повідомте про помилку користувача.
public class Calculator {
    public static void main(String[] args) {
        double operand1 = 0;
        double operand2 = 0;
        double result = 0;
        String sign;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть два цілих числа: ");
        operand1 = scanner.nextInt();
        operand2 = scanner.nextInt();

        System.out.println("Введіть дію котру ви хочете провести над двома числами \nПідказка! Дії можуть бути: '+' '-' " +
                "'*' '/' або '%'");
        scanner = new Scanner(System.in);
        sign = scanner.nextLine();

        switch (sign) {
            case "+": {
                result = operand1 + operand2;
                System.out.println(result);
                break;
            }
            case "-": {
                result = operand1 - operand2;
                System.out.println(result);
                break;
            }
            case "*": {
                result = operand1 * operand2;
                System.out.println(result);
                break;
            }
            case "/": {
                if (operand2 == 0) {
                    System.out.println("Вибачте, на нуль ділити не можна!");
                }
                result = operand1 / operand2;
                System.out.println(result);
                break;
            }
            case "%": {
                result = operand1 % operand2;
                System.out.println(result);
                break;
            }
        }
    }
}
