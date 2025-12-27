//Завдання 3
//Використовуючи IntelliJ IDEA, створіть проєкт. Створіть три рядкові змінні та задайте їм значення:
//        "\nмій рядок 1"
//        "\tмій рядок 2"
//        "\aмій рядок 3"
//Виведіть значення кожної змінної на екран. Які відмінності ви побачили? Зробіть висновки.

public class Solution003 {
    public static void main(String[] args) {
        String first = "\nмій рядок 1";
        String second = "\tмій рядок 2";
        String third = "\fмій рядок 3";

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
