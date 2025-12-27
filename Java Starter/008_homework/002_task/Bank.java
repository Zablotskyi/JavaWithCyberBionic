import java.util.Scanner;

//Завдання 2
//
//Використовуючи IntelliJ IDEA, створіть клас Bank. Уявіть, що ви реалізуєте програму для банку, яка допомагає
// визначити, погасив клієнт кредит чи ні. Припустимо, щомісячна сума платежу має становити 100 грн. Клієнт має виконати
// 7 платежів, але може платити рідше великими сумами. Тобто може двома платежами по 300 і 400 грн закрити весь борг.
//
//Створіть метод, який як аргумент прийматиме суму платежу, введену економістом банку. Метод виводить на екран
// інформацію про стан кредиту (сума заборгованості, сума переплат, повідомлення про відсутність боргу).
public class Bank {
    public static int loanPayment;
    public static int loanBalance;
    public static int step = 7;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введіть суму кредиту: ");
        int loanAmount = scanner.nextInt();
        loanBalance = loanAmount;
        System.out.println("Кредит надано на 7 місяців. Мінімальний платіж : " + loanAmount / 7 + " Але можна платити " +
                "більшими сумами і виплатити кредит раніше.");


        creditInformation(loanPayment);
    }

    private static void creditInformation(int loanPayment) {
        for (int i = 1; i <= step + 1; i++) {
            if (loanBalance > 0) {
                System.out.println("Введіть суму платежу " + i + " місяць");
                loanPayment = scanner.nextInt();
                loanBalance -= loanPayment;

                System.out.println("Прийнято платіж: " + loanPayment + " грн. Залишилося " + (7 - i) + " платежів. " +
                        "Залишок по кредиту дорівнює: " + loanBalance);
            } else {
                break;
            }
        }
        System.out.println("Кредит погашено!");

    }
}
