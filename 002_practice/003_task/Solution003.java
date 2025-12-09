//Begin3◦. Дано сторони прямокутника a і b. Знайти його площу S = a-b і периметр P = 2*(a + b).
public class Solution003 {
    public static void main(String[] args) {
        int sideA = 5;
        int sideB = 8;
        int area = sideA * sideB;
        int perimeter = 2 * (sideA + sideB);

        System.out.println("Площа: " + area + " Периметр: " + perimeter);
    }
}
