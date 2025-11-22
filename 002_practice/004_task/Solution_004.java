import java.util.Scanner;

// Begin4◦ . Дано діаметр кола d. Знайти його довжину L = π*d. Як значення π використовувати 3.14.
public class Solution_004 {
    static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть діаметр кола (ціле число): ");
        int diameter = scanner.nextInt();
        double length = PI * diameter;

        System.out.println("Довжина кола дорівнює: " + length);
    }
}
