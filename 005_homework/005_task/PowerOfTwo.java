import java.util.Scanner;

//Завдання 5
//
//Відомо, що в числах, які є ступенем двійки, лише один біт має значення 1. Використовуючи IntelliJ IDEA, створіть клас
// PowerOfTwo. Напишіть програму, яка перевірятиме, чи є вказане число ступенем двійки, чи ні.
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціле число, котре треба перевірити чи є воно степенем двійки: ");
        int number = scanner.nextInt();
        boolean result = (number & (number - 1)) == 0;

        if (result)
            System.out.println("Число є степенем двійки");
        else
            System.out.println("Число не є степенем двійки");
    }
}
