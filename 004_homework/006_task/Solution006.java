// Завдання 6
//
//Дано три цілих числа. Знайдіть максимальне, мінімальне та середнє.
import java.util.Scanner;

public class Solution006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть три цілих числа через 'Enter':");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int minimum = 0;
        int medium = 0;
        int maximum = 0;

        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            minimum = firstNumber;
            if (secondNumber < thirdNumber) {
                medium = secondNumber;
                maximum = thirdNumber;
            } else {
                medium = thirdNumber;
                maximum = secondNumber;
            }
        }
        if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            minimum = secondNumber;
            if (firstNumber < thirdNumber) {
                medium = firstNumber;
                minimum = thirdNumber;
            } else {
                medium = thirdNumber;
                maximum = firstNumber;
            }
        }
        if (thirdNumber < firstNumber && thirdNumber < secondNumber) {
            minimum = thirdNumber;
            if (firstNumber < secondNumber) {
                medium = firstNumber;
                maximum = secondNumber;
            } else {
                medium = secondNumber;
                maximum = firstNumber;
            }
        }
        System.out.println("Мінімальне число: " + minimum + " Середнє число: " + medium + " Максимальне число: " + maximum);
    }
}
