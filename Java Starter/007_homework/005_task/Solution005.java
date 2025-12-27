//Завдання 5
//
//Опишіть метод powerA3(a), який обчислює третю степінь числа та повертає це значення. За допомогою цієї процедури
// знайдіть третій степінь п'яти зазначених чисел.
public class Solution005 {
    public static void main(String[] args) {
        A234(2);
        A234(3);
        A234(5);
        A234(10);
        A234(100);

    }

    public static void A234(int a) {
        int result = a * a * a;

        System.out.println("Число " + a + " в степені 3 дорівнює: " + result);
    }
}
