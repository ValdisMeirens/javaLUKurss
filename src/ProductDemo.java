public class ProductDemo {

    public static void main(String[] args) {
        Product product1 = new Product("Pepsi");
        product1.setPrice(100);
        product1.setDiscount(42);
        product1.actualPrice();
        product1.printInformation();
    }
}
