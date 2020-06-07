package com.moulay.restaurantappview;

public class FoodModel {

    private int image;
    private String title;
    private String desc;
    private float price;
    private int stars;

    public FoodModel(int image, String title, String desc, int stars, float price) {
        this.image = image;
        this.title = title;
        this.desc = desc;
        this.stars = stars;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

