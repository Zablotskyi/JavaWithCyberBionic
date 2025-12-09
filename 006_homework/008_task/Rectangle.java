//Завдання 8
//
//Використовуючи IntelliJ IDEA, створіть клас Rectangle. Створіть дві цілочислові змінні та задайте їм деякі значення.
// Застосовуючи техніку вкладених циклів, намалюйте прямокутник із зірочок. Використовуйте значення раніше створених
// змінних для вказівки висоти та ширини прямокутника.
public class Rectangle {
    public static void main(String[] args) {
        int width = 5;
        int height = 10;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 | j == 0 | i == width - 1 | j == height - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
