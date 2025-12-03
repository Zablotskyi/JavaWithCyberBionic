import java.util.Scanner;

//Завдання 4
//Є N клієнтів, яким компанія-виробник має доставити товар. Скільки є можливих маршрутів доставлення товару з
// урахуванням того, що товар доставлятиме одна машина? Використовуючи IntelliJ IDEA, створіть клас Delivery. Напишіть
// програму, яка розраховуватиме та виводитиме на екран кількість можливих варіантів доставлення товару. Для розв’язку
// задачі використовуйте факторіал N!, що розраховується за допомогою циклу do-while.
public class Delivery {
    public static void main(String[] args) {
        System.out.println("Введіть кількість клієнтів, котрим треба доставити товар: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long factorial = 1;
        int counter = 1;

        do{
            factorial *= counter;
            counter++;
        } while (counter <= N);

        System.out.println("Кількість можливих маршрутів: " + factorial);
    }
}
