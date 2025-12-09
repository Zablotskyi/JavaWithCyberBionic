import java.util.Scanner;

//Використовуючи IntelliJ IDEA, створіть клас SumMin. Дано два числа A та B (A<B). Виведіть суму всіх чисел, які
// розташовані між цими числами на екран. Дано два числа A та B (A<B). Виведіть усі непарні значення, які розташовані
// між цими числами.
public class SumMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть два цілих числа через 'Enter'. Перше число має бути менше за друге:");
        int sum = 0;
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        for (int i = A + 1; i < B; i++) {
            sum += i;
        }
        System.out.println("Сума всіх чисел між " + A + " та " + B + " дорівнює: " + sum);
    }
}
