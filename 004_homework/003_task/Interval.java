import java.sql.SQLOutput;
import java.util.Scanner;

// Завдання 3
//
//Використовуючи IntelliJ IDEA, створіть клас Interval.
//
//Напишіть програму визначення, чи потрапляє вказане користувачем число від 0 до 100 до числового проміжку
// [0 - 14] [15 - 35] [36 - 50][51 - 100]. Якщо так, то вкажіть, в який саме проміжок. Якщо користувач вказує число,
// що не входить до жодного з наявних числових проміжків, то виводиться відповідне повідомлення.
public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ціле число для визначення його діапазону:");
        int number = scanner.nextInt();

        if (number < 0 && number > 100)
            System.out.println("Ваше число не належить до жодного з можливих діапазонів");
        if (number >= 0 && number <= 14)
            System.out.println("Ваше число належить до діапазону: [0 - 14]");
        if (number >= 15 && number <= 35)
            System.out.println("Ваше число належить до діапазону: [15 - 35]");
        if (number >= 36 && number <= 50)
            System.out.println("Ваше число належить до діапазону: [36 - 50]");
        if (number >= 51 && number <= 100)
            System.out.println("Ваше число належить до діапазону: [51 - 100]");
    }
}
