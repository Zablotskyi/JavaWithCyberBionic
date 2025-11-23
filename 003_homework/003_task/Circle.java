// Завдання 3
//
// Використовуючи IntelliJ IDEA, створіть клас Circle. Створіть константу під назвою PI (число π «пі»), створіть змінну
// радіус із назвою – r. Використовуючи формулу πR2, обчисліть площу кола та виведіть результат на екран.
public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14;
        int r = 3;
        double area = PI * Math.pow(r, 2);

        System.out.println(area);
    }
}
