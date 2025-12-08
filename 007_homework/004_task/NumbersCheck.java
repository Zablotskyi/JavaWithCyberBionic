import java.util.Scanner;

//Завдання 4
//
//Використовуючи IntelliJ IDEA, створіть клас NumbersCheck. Напишіть метод, який визначатиме:
//1)      чи є введене число позитивним, чи негативним;
//2)      чи є воно простим (використовуйте техніку перебору значень).
//Просте число – це натуральне число, яке ділиться на 1 й саме на себе. Щоби визначити просте число чи ні, варто знайти
// всі його цілі дільники. Якщо дільників більше 2-х, то воно не просте;
//3)      чи ділиться воно на 2, 5, 3, 6, 9 без залишку.
public class NumbersCheck {
    public static void main(String[] args) {
        System.out.println("Введіть ціле число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Число " + number + " позитивне? : " + isPositive(number));
        System.out.println("Число " + number + " просте? : " + isSimple(number));
        isDivisionWithoutRemainder(number, 2);
        isDivisionWithoutRemainder(number, 5);
        isDivisionWithoutRemainder(number, 3);
        isDivisionWithoutRemainder(number, 9);
    }

    public static String isPositive(int a) {
        if (a == 0) {
            return "Число дорівнює нулю";
        }
        if (a > 0) {
            return "число позитивне";
        } else {
            return "число негативне";
        }
    }

    public static String isSimple(int number) {
        if (number <= 1)
            return "число не просте";

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return "число не просте";
            }
        }
        return "число просте";
    }

    public static void isDivisionWithoutRemainder(int number, int divisor) {
        if (number % divisor == 0)
            System.out.println("Число ділиться на " + divisor + " без залишку");
        else
            System.out.println("Число не ділиться на: " + divisor);
    }
}
