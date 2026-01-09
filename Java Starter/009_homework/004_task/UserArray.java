import java.util.Random;
import java.util.Scanner;

//Завдання 4
//Використовуючи IntelliJ IDEA, створіть клас UserArray. Створити метод, який виконуватиме збільшення довжини масиву,
//переданого як аргумент, на 1 елемент. Елементи масиву мають зберегти своє значення та порядок індексів. Створити метод,
//який приймає два аргументи, перший аргумент типу int [] array, другий аргумент типу int value. У тілі методу реалізуйте
//можливість додавання другого аргументу методу в масив за індексом 0, водночас довжина нового масиву має збільшитися на
//1 елемент, а елементи одержуваного масиву як перший аргумент мають скопіюватися в новий масив починаючи з індексу 1.
public class UserArray {
    static int[] array = null;
    static int[] arrayCopy = null;
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмірність масиву(ціле число) котрий треба створити і заповнити числами: ");
        int length = scanner.nextInt();

        createArray(length);
        arrayFilling(array);
        addOneElevent(array);

        System.out.println("\nВведіть ціле число, котре треба додати на нульову позицію нашого нового масиву");
        int element = scanner.nextInt();
        copyingAndIncreasingArrayAddingOneElement(arrayCopy, element);
    }

    private static void copyingAndIncreasingArrayAddingOneElement(int[] arrayCopy, int element) {
        int[] newArray = new int[arrayCopy.length + 1];
        newArray[0] = element;
        for (int i = 1; i < arrayCopy.length; i++) {
            newArray[i] = arrayCopy[i - 1];
        }

        System.out.println("Новий масив з елементом на нульовій позиції: ");
        for (int cell : newArray)
            System.out.print(cell + " ");
    }

    private static void addOneElevent(int[] array) {
        System.out.println("\nСтворено масив на один елемент більше");
        arrayCopy = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        System.out.println("Новий масив: ");
        for (int cell : arrayCopy)
            System.out.print(cell + " ");
    }

    private static void arrayFilling(int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Масив заповлено рандомними числами");
        for (int cell : array)
            System.out.print(cell + " ");
    }

    private static void createArray(int length) {
        array = new int[length];
        System.out.println("Створено масив з " + length + " елементів");
    }
}
