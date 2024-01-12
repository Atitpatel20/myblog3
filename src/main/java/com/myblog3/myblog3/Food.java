package com.myblog3.myblog3;

public class Food {
    private String food;
    private String foodName;
    private long price;

    public String getFood() {
        return food;
    }

    public String getFoodName() {
        return foodName;
    }

    public long getPrice() {
        return price;
    }

    public Food(String food, String foodName, long price) {
        this.food = food;
        this.foodName = foodName;
        this.price = price;
    }
}
