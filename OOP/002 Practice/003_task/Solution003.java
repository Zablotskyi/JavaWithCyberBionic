//Поля
//
//Продавець
//
//Найменування
//
//Кількість
//
//Ціна
//
//Дата_продажу
//
//Визначити кількість товарів, які продані менше року тому і вивести відомості про них.
public class Solution003 {
    public static void main(String[] args) {
        Product product1 = new Product("Seller1", "book1", 15, 621,2025);
        Product product2 = new Product("Seller2", "book2", 10, 785.5,2021);
        Product product3 = new Product("Seller3", "book3", 11, 1230, 2025);
        Product product4 = new Product("Seller4", "book4", 3, 850.30 ,2023);
        Product product5 = new Product("Seller5", "book5", 21, 739,2022);

        Product[] products = new Product[]{product1, product2, product3, product4, product5};

        goodsSoldLessYearAgo(products);
    }

    private static void goodsSoldLessYearAgo(Product[] products) {
        for (Product product : products) {
            if (product.getDateOfSale() > 2024) {
                System.out.println(product);
            }
        }
    }
}
