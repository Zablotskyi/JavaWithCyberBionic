import java.util.Scanner;

public class Solution015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int result = 0;

        if (k < l && k < m) {
            result = l + m;
            System.out.println(result);
        }
        if (l < k && l < m) {
            result = k + m;
            System.out.println(result);
        }
        if (m < k && m < l) {
            result = k + l;
            System.out.println(result);
        }
    }
}
