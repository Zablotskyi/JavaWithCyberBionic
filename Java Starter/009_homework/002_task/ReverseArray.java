import java.util.Random;
import java.util.Scanner;

//Використовуючи IntelliJ IDEA, створіть клас CustomerArray. Створити масив розміру N-елементів, заповнити його
// довільними цілими значеннями (розмір масиву задає користувач). Вивести на екран: найбільше значення масиву, найменше
// значення масиву, загальну суму всіх елементів, середнє арифметичне всіх елементів, вивести всі непарні значення.
public class ReverseArray {
    static int[] array = null;
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмірність масиву(ціле число) котрий треба створити і заповнити числами: ");
        int length = scanner.nextInt();

        createArray(length);
        arrayFilling(array);
        maxValueOfArray(array);
        minValueOfArray(array);
        sumAllArrayElements(array);
        arithmeticAverageAllElementsArray(array);
        allOddvaluesArray(array);

    }

    private static void allOddvaluesArray(int[] array) {
        System.out.print("Всі парні елементи масиву: ");
        for (int cell : array) {
            if (cell % 2 == 0)
                System.out.print(cell + " ");
        }
    }

    private static void arithmeticAverageAllElementsArray(int[] array) {
        double average = 0;
        int sum = 0;
        for (int cell : array) {
            sum += cell;
        }
        average = sum / array.length;
        System.out.println("Середнє арифметичне всіх елементів масиву дорівнює: " + average);
    }

    private static void sumAllArrayElements(int[] array) {
        int sum = 0;
        for (int cell : array) {
            sum += cell;
        }
        System.out.println("Сума всіх елементів масиву дорівнює: " + sum);
    }

    private static void maxValueOfArray(int[] array) {
        int max = 0;
        for (int cell : array) {
            if (cell > max)
                max = cell;
        }
        System.out.println("Максимальний елемент масиву дорівнює: " + max);
    }

    private static void minValueOfArray(int[] array) {
        int min = 2147483647;
        for (int cell : array) {
            if (cell < min)
                min = cell;
        }
        System.out.println("Мінімальний елемент масиву дорівнює: " + min);
    }

    private static void arrayFilling(int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        System.out.println("Масив заповлено рандомними числами");
    }

    private static void createArray(int length) {
        array = new int[length];
        System.out.println("Створено масив з " + length + " елементів");
    }
}
