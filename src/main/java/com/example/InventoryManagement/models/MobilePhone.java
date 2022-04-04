package com.example.InventoryManagement.models;

public class MobilePhone extends Item{

    private String colour;
    private double size;

    public MobilePhone(String model, Manufacturer manufacturer, String productNumber, String category, int stock, int buyingPrice, int sellingPrice, String colour, double size) {
        super(model, manufacturer, productNumber, category, stock, buyingPrice, sellingPrice);
        this.colour = colour;
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int purchasePrice() {
        return getBuyingPrice();
    }

    public int calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
