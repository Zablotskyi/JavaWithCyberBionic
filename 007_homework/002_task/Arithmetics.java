import java.util.Scanner;

//Завдання 2
//
//Використовуючи IntelliJ IDEA, створіть клас Arithmetics. Створіть чотири методи для виконання арифметичних операцій з
// іменами: add – додавання, sub – віднімання, mul – множення, div – ділення. Кожен метод має приймати два цілих
// аргументи та виводити на екран результат виконання арифметичної операції відповідної імені методу. Метод поділу div
// має виконувати перевірку спроби поділу на нуль. Потрібно надати користувачеві можливість вводити з клавіатури
// значення операндів і знак арифметичної операції для виконання обчислень.
public class Arithmetics {
    static int firstOperand;
    static int secondOperand;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть через 'Enter' два цілих числа над котрими ви хочете провести арифметичну дію: ");
        firstOperand = scanner.nextInt();
        secondOperand = scanner.nextInt();

        System.out.println("Виберіть дію котру треба провести (натисніть '+', '-', '*' або '/' на клавіатурі)");
        scanner = new Scanner(System.in);
        String action = scanner.nextLine();

        selection(action);
    }

    private static void selection(String action) {
        switch (action) {
            case "+" : {
                add(firstOperand, secondOperand);
                break;
            }
            case "-" : {
                sub(firstOperand, secondOperand);
                break;
            }
            case "*" : {
                mul(firstOperand, secondOperand);
                break;
            }
            case "/" : {
                div(firstOperand, secondOperand);
                break;
            }
        }
    }

    public static void add(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void sub(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    public static void mul(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    public static void div(int a, int b) {
        if (b == 0) {
            System.out.println("Ділити на 0 не можна");
        }
        double result = (double) a / b;
        System.out.println(result);
    }
}
