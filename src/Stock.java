public class Stock {
    String name;
    int actualPrice;
    int maxPrice;
    int minPrice;

    Stock(String name, int actualPrice){
        this.name = name;
        this.actualPrice = actualPrice;
        this.maxPrice = actualPrice;
        this.minPrice  =actualPrice;
    }

    String getPriceInformation(){
        return "Company = "+this.name+", Current Price = "+this.actualPrice+" Min Price = "+this.minPrice+", Max Price = " +this.maxPrice;
    }

    void updatePrice(int stockPrice){
        this.actualPrice = stockPrice;
        if(this.minPrice > this.actualPrice){
            this.minPrice = this.actualPrice;
        }
        if(this.maxPrice < this.actualPrice){
            this.maxPrice = this.actualPrice;
        }
    }
}
