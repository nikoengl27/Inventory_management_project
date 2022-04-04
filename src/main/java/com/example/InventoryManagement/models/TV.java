package com.example.InventoryManagement.models;

public class TV extends Item{

    private String screenResolution;
    private boolean smart;
    private String

    public TV(String model, Manufacturer manufacturer, String productNumber, String category, int stock, int buyingPrice, int sellingPrice, String screenResolution, boolean smart) {
        super(model, manufacturer, productNumber, category, stock, buyingPrice, sellingPrice);
        this.screenResolution = screenResolution;
        this.smart = smart;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public int purchasePrice() {
        return getBuyingPrice();
    }

    @Override
    public int calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
