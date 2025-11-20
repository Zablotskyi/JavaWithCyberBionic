import java.util.Scanner;

// Integer3◦ . Дано розмір файлу в байтах. Використовуючи операцію ділення націло, знайти кількість повних кілобайтів,
// які займає цей файл (1 кілобайт = 1024 байта).
//
public class Solution003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть, будь ласка, розмір файлу на диску:");
        int size = scanner.nextInt();
        int result = size / 1024;

        System.out.println("Розмір файлу: " + result);
    }
}
