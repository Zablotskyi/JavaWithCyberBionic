//Завдання 3
//
//Використовуючи IntelliJ IDEA, створіть клас ReversedArray. Створити метод myReverse(int [] array), який приймає як
// аргумент масив цілочислових елементів і повертає інвертований масив (елементи масиву у зворотному порядку). Створити
// метод int [] subArray (int [] array, int index, int count). Метод повертає частину отриманого як аргумент масиву,
// починаючи з позиції, яка зазначена в аргументі index, розмірністю, що відповідає значенню аргументу count. Якщо
// аргумент count містить значення більше, ніж кількість елементів, що входять до частини вихідного масиву (від
// зазначеного індексу index до індексу останнього елемента), то під час формування нового масиву розмірністю в count,
// заповніть одиницями ті елементи, які не були скопійовані з вихідного масиву.
public class ReversedArray {
    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        System.out.println("Наш первинний масив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        myReverse(array);
        subArray(array, 6, 10);
    }

    private static void subArray(int[] array, int index, int count) {
        int[] arrayCoppy = new int[count - index + 1];
                System.out.println("\nМасив в діамазоні: " + index + " - " + count + ": ");
        int start = index - 1; // 1-based → 0-based

        for (int i = 0; i < arrayCoppy.length; i++) {
            int srcIndex = start + i;
            if (srcIndex < array.length) {
                arrayCoppy[i] = array[srcIndex];
            } else {
                arrayCoppy[i] = 1;
            }
        }

        for (Integer cell : arrayCoppy)
            System.out.print(cell + " ");
    }

    private static void myReverse(int[] array) {
        System.out.println("\nНаш інвертований масив: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
