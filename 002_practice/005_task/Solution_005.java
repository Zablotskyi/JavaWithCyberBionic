import java.util.Scanner;

//Begin5◦. Дано довжину ребра куба a. Знайти об'єм куба V = a^3 і площу його поверхні S = 6-a^2
public class Solution_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довжину ребра куба (ціле число): ");
        int ribLength = scanner.nextInt();
        int volume = (int) Math.pow(ribLength, 3);
        int area = (int) ((int) 6 * Math.pow(ribLength, 2));

        System.out.println("Об'єм куба дорівнює: " + volume + "; Площа куба дорівнює: " + area);
    }
}
