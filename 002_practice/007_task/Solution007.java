import java.util.Scanner;

//Begin7◦ . Знайти довжину кола L і площу кола S заданого радіуса R:
//
//L = 2*π*R, S = π*R^2
//
//Як значення π використовувати 3.14.
public class Solution007 {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть радіус кола (ціле число): ");
        int radius = scanner.nextInt();

        double L = 2 * PI * radius;
        double S = PI * Math.pow(radius, 2);

        System.out.println("Довжина кола: " + L + " Площа кола: " + S);
    }
}
