import java.math.BigDecimal;
//Завдання 2
//Використовуючи IntelliJ IDEA, створіть проєкт. Дано значення числа pi, яке дорівнює 3,141592653, та значення числа
// Ейлера е, яке дорівнює 2,7182818284590452. Створіть дві змінні, надайте їм значення числа pi та числа е та виведіть
// їх на екран без втрати точності.

public class Solution002 {
    public static final double PI = 3.141592653;
    public static final BigDecimal E = new BigDecimal("2.7182818284590452");

    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(E.toPlainString());
    }
}
