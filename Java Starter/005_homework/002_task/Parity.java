import java.util.Scanner;

//Завдання 2
//
//Відомо, що в парних числах молодший біт має значення 0. Використовуючи IntelliJ IDEA, створіть клас Parity. Напишіть
// програму, яка виконуватиме перевірку чисел на парність. Запропонуйте два варіанти розв'язку поставленого завдання.
public class Parity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть, будь ласка, ціле число:");
        int number = scanner.nextInt();

        // Option I
        if (number % 2 == 0)
            System.out.println("Ви ввели парне число");
        else
            System.out.println("Ви ввели непарне число");

        // Option II
        boolean result;
        if ((number & 1) == 0)
            System.out.println("Ви ввели парне число");
        else
            System.out.println("Ви ввели непарне число");
    }
}
