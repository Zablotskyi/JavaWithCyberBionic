//Завдання 5
//
//Створіть два масиви 3х3, заповніть їх, створіть третій масив порожній. У третій масив внесіть результат додавання перших двох.
public class Solution {
    public static int[][] firstArray = {{1,2,3}, {4,5,6}, {7,8,9}};
    public static int[][] secondArray = {{1,2,3}, {4,5,6}, {7,8,9}};

    public static void main(String[] args) {
        assemblyTwoTreeeDimensionalArrays(firstArray, secondArray);
    }

    private static void assemblyTwoTreeeDimensionalArrays(int[][] firstArray, int[][] secondArray) {
        int[][] resultArray = new int[3][3];
        System.out.println("Отримано новий масив (сума двох): ");
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                resultArray[i][j] = firstArray[i][j] + secondArray[i][j];
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
