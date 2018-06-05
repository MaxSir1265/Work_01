package com.mak.shop03;

/**
 * Created by Макс on 16.05.2018.
 */

public class Items {
    private String price;
    private String name;
    private String imageURL;
    private String description;

    public Items(String price, String name, String imageURL, String description) {
        this.price = price;
        this.name = name;
        this.imageURL = imageURL;
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getDescription() {
        return description;
    }
}
