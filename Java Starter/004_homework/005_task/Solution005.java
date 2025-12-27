import java.util.Scanner;

//Завдання 5
//
//Дано ціле число. Якщо воно є позитивним, додайте до нього 1; інакше відніміть із нього 2. Виведіть отримане число.
public class Solution005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть ціле число:");
        int number = scanner.nextInt();
        int result = (number > 0) ? ++number : number - 2;
        System.out.println(result);
    }
}
