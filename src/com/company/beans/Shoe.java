package com.company.beans;

public class Shoe extends Brand{
    private String brandId;
    private String shoeTypeId;
    private String color;
    private String shelfID;
    private String price;

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getShoeTypeId() {
        return shoeTypeId;
    }

    public void setShoeTypeId(String shoeTypeId) {
        this.shoeTypeId = shoeTypeId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShelfID() {
        return shelfID;
    }

    public void setShelfID(String shelfID) {
        this.shelfID = shelfID;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
