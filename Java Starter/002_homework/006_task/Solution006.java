//Завдання 6
//Використовуючи IntelliJ IDEA, створіть проєкт. Створіть необхідну кількість змінних типу char, кожній змінній надайте
//значення одного символу у форматі UNICODE. Виведіть у консоль фразу «Добридень, ВАШЕ_ІМ'Я!».
public class Solution006 {
    public static void main(String[] args) {

        // Слово "Добридень,"
        char d1 = '\u0414'; // Д
        char d2 = '\u043E'; // о
        char d3 = '\u0431'; // б
        char d4 = '\u0440'; // р
        char d5 = '\u0438'; // и
        char d6 = '\u0434'; // д
        char d7 = '\u0435'; // е
        char d8 = '\u043D'; // н
        char d9 = '\u044C'; // ь
        char comma = ',';   // ,

        char space = ' ';

        // Ім’я "Василь"
        char v1 = '\u0412'; // В
        char v2 = '\u0430'; // а
        char v3 = '\u0441'; // с
        char v4 = '\u0438'; // и
        char v5 = '\u043B'; // л
        char v6 = '\u044C'; // ь

        char ex = '!';

        String line = "" +
                d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + comma + space +
                v1 + v2 + v3 + v4 + v5 + v6 + ex;

        System.out.println(line);
    }
}
