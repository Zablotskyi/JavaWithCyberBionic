import java.util.Scanner;

public class Solution004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість чисел (від 3 до 5) серед яких треба знайти середнє арифметичне");
        int count = scanner.nextInt();
        int a, b, c, d, e;

        switch (count) {
            case 3: {
                System.out.println("Введіть три цілих числа через 'Enter'");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();

                average(a, b, c);
                break;
            }
            case 4: {
                System.out.println("Введіть чотири цілих числа через 'Enter'");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                d = scanner.nextInt();

                average(a, b, c, d);
                break;
            }
            case 5: {
                System.out.println("Введіть п'ять цілих числа через 'Enter'");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                d = scanner.nextInt();
                e = scanner.nextInt();

                average( a, b, c, d, e);
                break;
            }
        }
    }

    public static void average(int a, int b, int c) {
        System.out.println((double) (a + b + c) / 3);
    }

    public static void average(int a, int b, int c, int d) {
        System.out.println((double) (a + b + c + d) / 4);
    }

    public static void average(int a, int b, int c, int d, int e) {
        System.out.println((double) (a + b + c + d + e) / 5);
    }
}
