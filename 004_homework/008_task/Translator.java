import java.util.Scanner;

//Завдання 8
//
//Використовуючи IntelliJ IDEA, створіть клас Translator.
//
//Напишіть програму «Україно-англійський перекладач». Програма знає 10 слів про погоду. Потрібно, щоб користувач вводив
// слово українською, а програма давала йому переклад цього слова англійською. Якщо користувач ввів слово, для якого
// немає перекладу, слід вивести повідомлення, що такого слова немає.
public class Translator {
    public static void main(String[] args) {
        //Dictionary: warm, hot, rainy, windy, snow, slippery, cold, wet, sunny, cloudy
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        switch (word) {
            case "тепло":
                System.out.println("warm");
                break;
            case "жарко":
                System.out.println("hot");
                break;
            case "дощ":
                System.out.println("rainy");
                break;
            case "вітер":
                System.out.println("windy");
                break;
            case "сніг":
                System.out.println("snow");
                break;
            case "слизько":
                System.out.println("slippery");
                break;
            case "холодно":
                System.out.println("cold");
                break;
            case "мокро":
                System.out.println("wet");
                break;
            case "сонячно":
                System.out.println("sunny");
                break;
            case "хмарно":
                System.out.println("cloudy");
                break;
        }
    }
}
