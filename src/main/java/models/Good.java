package models;

public class Good {
    public int categoryId;
    public String name;
    public  int quantity;
    public  double buyingPrice;
    public double sellingPrice;
    public double grossPrice;

    public Good(int categoryId, String name, int quantity, double buyingPrice, double sellingPrice, double grossPrice) {
        this.categoryId = categoryId;
        this.name = name;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.grossPrice = grossPrice;

    }

}
