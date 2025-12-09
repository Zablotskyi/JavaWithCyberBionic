import java.util.Scanner;

//Завдання 6
//Дано два цілих числа A і B (A < B). Знайдіть суму всіх цілих чисел від A до B включно.
public class Solution005 {
    public static void main(String[] args) {
        System.out.println("Введіть два цілих числа (перше число має бути меншим за друге: ");
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = 0;

        for (int i = A; i <= B; i++) {
            sum += i;
        }
        System.out.println("Сума всіх цілих чисел від А до В включно: " + sum);
    }
}
