package com.example.InventoryManagement.models;

public class Laptop extends Item{

    private double screenSize;
    private int RAM;

    public Laptop(String model, Manufacturer manufacturer, String productNumber, String category, int stock, int buyingPrice, int sellingPrice, double screenSize, int RAM) {
        super(model, manufacturer, productNumber, category, stock, buyingPrice, sellingPrice);
        this.screenSize = screenSize;
        this.RAM = RAM;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int purchasePrice() {
        return getBuyingPrice();
    }

    public int calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
