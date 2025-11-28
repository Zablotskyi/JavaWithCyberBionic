//Використовуючи IntelliJ IDEA, створіть клас LogicOperations. Є 3 змінні типу int x = 5, y = 10, і z = 15. Виконайте
// та розрахуйте результат таких операцій для цих змінних:
//§  x += y >> x++ * z;
//§  z = ++x & y * 5;
//§  y /= x + 5 | z;
//§  z = x++ & y * 5;
//§  x = y << x++ ^ z;
public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;

        int fistExample = x += y >> x++ * z;
        x = 5; y = 10; z = 15;
        int secondExample = z = ++x & y * 5;
        x = 5; y = 10; z = 15;
        int thirdExample = y /= x + 5 | z;
        x = 5; y = 10; z = 15;
        int fourthExample = z = x++ & y * 5;
        x = 5; y = 10; z = 15;
        int fifthExample = x = y << x++ ^ z;

        System.out.println("Відповідь перша: " + fistExample + "\nВідповідь друга: " + secondExample + "\nВідповідь" +
                " третя: " + thirdExample + "\nВідповідь четверта: " + fourthExample + "\nВідповідь п'ята: " +fifthExample);
    }
}
