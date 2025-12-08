import java.util.Scanner;

//Завдання 7
//
//Використовуючи IntelliJ IDEA, створіть клас Calculator. Створіть метод з ім'ям calculate, який приймає як параметри
// три цілих аргументи та виводить на екран середнє арифметичне значень аргументів.
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть три цілих числа через 'Enter' середнє арифметичне котрих треба знайти:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        calculate(firstNumber, secondNumber, thirdNumber);
    }

    public static void calculate (int a, int b, int c) {
        double result = (a + b + c) / 3;

        System.out.println("Прийнято три числа: " + a + ", " + b + ", " + c + " \n\nСереднє аривметичне цих чисел: " + result);
    }
}
