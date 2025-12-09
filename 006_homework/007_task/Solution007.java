//Завдання 7
//Створіть програму таблиці множення для числа 7, використовуючи цикли. Приклад виведення в консоль:
//7 * 1 = 7;
//7 * 2 = 14;
//…;
//7 * 10 = 70.
public class Solution007 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10) {
            System.out.println("7 * " + counter + " = " + counter * 7);
            counter++;
        }
    }
}
