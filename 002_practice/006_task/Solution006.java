import java.util.Scanner;

//Begin6◦. Дано довжини ребер a, b, c прямокутного паралелепіпеда. Знайти
//
//його об'єм V = a-b-c і площу поверхні S = 2*(a-b + b-c + a-c).
public class Solution006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть три сторони паралелепіпеда (три цілі числа) через 'Enter':");
        int firstSide = scanner.nextInt();
        int secondSide = scanner.nextInt();
        int thirdSide = scanner.nextInt();
        int V = firstSide * secondSide * thirdSide;
        int S = 2 * (firstSide * secondSide + secondSide * thirdSide + firstSide * thirdSide);

        System.out.println("Об'єм паралелепіпеда: " + V + " Площа паралелепіпеда: " + S);
    }
}
