//Завдання 3
//
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
        System.out.println("right-angled triangle");
        //right-angled triangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
//                if (i == 0 & j < 1)
//                    System.out.print("*");
//                else if (i == 1 & j < 2)
//                    System.out.print("*");
//                else if (i == 2 & j < 3)
//                    System.out.print("*");
//                else if (i == 3 & j < 4)
//                    System.out.print("*");
//                else if (i == 4 & j < 5)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
            }
            System.out.print("\n");
        }

        for (int i = 1; i <= 5; i++) {

            // Перша та остання лінія — повністю зірочки
            if (i == 1 || i == 5) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                // Для середніх рядків:
                // перший символ *
                System.out.print("*");
                // пробіли між першою і останньою *
                for (int j = 1; j < i - 1; j++) {
                    System.out.print(" ");
                }
                // останній символ *
                System.out.print("*");
            }

            System.out.println();
        }
        //equilateral triangle
        //rhombus
    }
}
