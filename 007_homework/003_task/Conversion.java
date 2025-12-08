import java.util.Scanner;

//Завдання 3
//
//Використовуючи IntelliJ IDEA, створіть клас Conversion. Напишіть програму, яка конвертуватиме валюти.
// Користувач вводить:
//1)      суму грошей у певній валюті;
//2)      курс конвертації в іншу валюту.
//Організуйте виведення результату операції конвертування валюти на екран.
public class Conversion {
    static int sum;
    static double exchangeRate;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть суму у гривні, котру ви хочете конвертувати у USDT: ");
        sum = scanner.nextInt();
        System.out.println("Введіть поточний курс на сьогодні: ");
        exchangeRate = scanner.nextDouble();

        System.out.println("До видачі: " + exchange(sum) + " USDT");

    }
    static double exchange(int a){
        double amountCurrencyReceived = sum / exchangeRate;

        return amountCurrencyReceived;
    }
}
