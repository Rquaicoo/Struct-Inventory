package models;

public class IssuedGood {
    public int goodId;
    public  int vendorId;
    public int quantity;
    public  double price;

    public IssuedGood(int goodId, int vendorId, int quantity, double price) {
        this.goodId = goodId;
        this.vendorId = vendorId;
        this.quantity = quantity;
        this.price = price;

    }
}
