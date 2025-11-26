import java.util.Scanner;

//Завдання 7
//
//Дано номер місяця – ціле число в діапазоні 1–12 (1 – січень, 2 – лютий і так далі). Визначте кількість днів цього місяця для невисокосного року.
public class Solution007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть порядковий номер місяця (ціле число): ");
        int number = scanner.nextInt();

        switch (number) {
            case 1: {
                System.out.println("Ви вибрали перший місяць, Січень, у ньому 31 день");
                break;
            }
            case 2: {
                System.out.println("Ви вибрали другий місяць, Лютий, у ньому 28 днів");
                break;
            }
            case 3: {
                System.out.println("Ви вибрали третій місяць, Березень, у ньому 31 день");
                break;
            }
            case 4: {
                System.out.println("Ви вибрали четвертий місяць, Квітень, у ньому 30 днів");
                break;
            }
            case 5: {
                System.out.println("Ви вибрали п'ятий місяць, Травень, у ньому 31 день");
                break;
            }
            case 6: {
                System.out.println("Ви вибрали шостий місяць, Червень, у ньому 30 днів");
                break;
            }
            case 7: {
                System.out.println("Ви вибрали сьомий місяць, Липень, у ньому 31 день");
                break;
            }
            case 8: {
                System.out.println("Ви вибрали восьмий місяць, Серпень, у ньому 31 день");
                break;
            }
            case 9: {
                System.out.println("Ви вибрали дев'ятий місяць, Вересень, у ньому 30 днів");
                break;
            }
            case 10: {
                System.out.println("Ви вибрали десятий місяць, Жовтень, у ньому 31 день");
                break;
            }
            case 11: {
                System.out.println("Ви вибрали одинадцятий місяць, Листопад, у ньому 30 днів");
                break;
            }
            case 12: {
                System.out.println("Ви вибрали дванадцятий місяць, Грудень, у ньому 31 день");
                break;
            }
        }
    }
}
