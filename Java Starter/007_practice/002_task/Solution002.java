import java.util.Scanner;
//Begin2◦. Дано сторону квадрата a. Знайти його площу S = a^2

public class Solution002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть стороно квадрати (ціле число): ");
        int side = scanner.nextInt();

        System.out.println("Площа квадрата: " + square(side));
    }
    static int square (int a) {
        int square = a * a;
        return square;
    }
}
