//Завдання 7
//
//Використовуючи IntelliJ IDEA, створіть клас Arrays. Створіть масив розмірністю 10 елементів, виведіть на екран усі
//елементи масиву у зворотному порядку.
public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[10];

        fillArray(array);
        reverseArray(array);
    }

    public static void fillArray(int[] array) {
        System.out.println("Створено масив на 10 елементів: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
    }

    public static void reverseArray(int[] array) {
        System.out.println("Виводимо масив у зворотньому порядку: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
