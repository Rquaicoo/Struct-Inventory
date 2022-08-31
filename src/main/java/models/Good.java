package models;

public class Good {
    public String category;
    public String name;
    public  int quantity;
    public  double buyingPrice;
    public double sellingPrice;
    public double grossPrice;

    public Good(String category, String name, int quantity, double buyingPrice, double sellingPrice, double grossPrice) {
        this.category = category;
        this.name = name;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.grossPrice = grossPrice;

    }

}
