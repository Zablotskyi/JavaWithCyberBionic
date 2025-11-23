//Завдання 1
//
//Є 3 змінні типу int x = 10, y = 12 та z = 3. Виконайте розрахунок результату таких операцій для цих змінних:
//§  x += y – x++ * z;
//§  z = --x – y * 5;
//§  y /= x + 5 % z;
//§  z = x++ + y * 5;
//§  x = y – x++ * z;
public class Solution001 {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 3;
        int result = 0;

        result = x += y - x++ * z;
        System.out.println(result);

        x = 10;
        y = 12;
        z = 3;
        result = z = --x - y * 5;
        System.out.println(result);

        x = 10;
        y = 12;
        z = 3;
        result = y /= x + 5 % z;
        System.out.println(result);

        x = 10;
        y = 12;
        z = 3;
        result = z = x++ + y * 5;
        System.out.println(result);

        x = 10;
        y = 12;
        z = 3;
        result = x = y - x++ * z;
        System.out.println(result);
    }
}
