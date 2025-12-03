import java.util.Scanner;

//Завдання 9
//
//Знайдіть послідовність Фібоначчі для заданого діапазону: користувач вводить стартове число та останнє
// з необхідного діапазону.
public class Solution009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть стартове число діапазону: ");
        long start = scanner.nextLong();
        System.out.println("Введіть кінцеве число діапазону: ");
        long finish = scanner.nextLong();
        long a = 0;
        long b = 1;

        System.out.println("Числа Фібоначчі у діапазоні [" + start + "; " + finish + "]:");

        while (a <= finish) {
            if (a >= start) {
                System.out.print(a + " ");
            }

            long next = a + b;
            a = b;
            b = next;
        }
    }
}
