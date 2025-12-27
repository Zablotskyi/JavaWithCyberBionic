import java.util.Scanner;

//Завдання 4
//
//Дано ціле число. Якщо воно є позитивним, додайте до нього 1; інакше не змінюйте його. Виведіть отримане число.
public class Solution004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть ціле число:");
        int number = scanner.nextInt();

        if (number > 0) {
            number++;
        }
        System.out.println(number);
    }
}
