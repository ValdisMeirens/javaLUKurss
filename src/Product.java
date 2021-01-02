public class Product {
    private String name;
    private double price;
    private double discount;

    Product(String name){
        this.name = name;
    }
    double actualPrice(){
        double discountValue = this.price * (this.discount /100);
        double result = this.price - discountValue;
        return result;
    }

    public void printInformation() {
        System.out.println("Name: " + this.name +" "+ "Price: " +this.actualPrice());
    }

    void setPrice(double price){
        this.price = price;
    }
    void setDiscount(double discount){
        this.discount = discount;
    }
}
