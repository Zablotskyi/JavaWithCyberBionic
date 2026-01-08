public class Product {
    private String seller;
    private String name;
    private int quantity;
    private double price;
    private int dateOfSale;

    public Product(String seller, String name, int quantity, double price, int dateOfSale) {
        this.seller = seller;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.dateOfSale = dateOfSale;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(int dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    @Override
    public String toString() {
        return "Product{" +
                "seller='" + seller + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", dateOfSale=" + dateOfSale +
                '}';
    }
}
