//For5◦ . Дано дійсне число - ціна 1 кг цукерок. Вивести вартість 0.1, 0.2, . . . , 1 кг цукерок.
public class Solution005 {
    public static void main(String[] args) {
        float price = 20;
        float counter = 0;
        float totalPrice = 0;

        while (counter <= 1) {
            totalPrice = counter * price;
            System.out.println("Вартість " + counter + " цукерок" + " = " + totalPrice + " грн.");

            counter += 0.1;
        }
    }
}