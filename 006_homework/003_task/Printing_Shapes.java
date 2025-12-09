//Завдання 3
//Використовуючи IntelliJ IDEA, створіть клас Printing_Shapes. Використовуючи цикли та метод: System.out.print("*"),
// System.out.print(" "), System.out.print("\n") (для переходу на новий рядок). Виведіть на екран:
//· прямокутник;
//· прямокутний трикутник;
//· рівносторонній трикутник;
//· ромб.
public class Printing_Shapes {
    public static void main(String[] args) {
        //rectangle
        System.out.println("rectangle");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 | j == 0 | i == 2 | j == 9) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        //right-angled triangle
        System.out.println("right-angled triangle");
        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 5) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j < i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
        //equilateral triangle
        System.out.println("equilateral triangle");
        int heightTriangle = 4;

        for (int i = 1; i <= heightTriangle; i++) {
            for (int j = 1; j <= heightTriangle - i; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("*");
                continue;
            }
            System.out.print("*");

            int innerSpace = 2 * i - 3;

            for (int j = 1; j <= innerSpace; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= 2 * heightTriangle - 1; i++) {
            System.out.print("*");
        }
        //rhombus
        System.out.println("\nrhombus");
        int heightRhombus = 5;
        for (int i = 1; i <= heightRhombus; i++) {

            for (int j = 1; j <= heightRhombus - i; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("*");
                continue;
            }
            System.out.print("*");

            int innerSpace = 2 * i - 3;
            for (int j = 1; j <= innerSpace; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = heightRhombus - 1; i >= 1; i--) {
            for (int j = 1; j <= heightRhombus - i; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("*");
                continue;
            }
            System.out.print("*");

            int innerSpace = 2 * i - 3;
            for (int j = 1; j <= innerSpace; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}