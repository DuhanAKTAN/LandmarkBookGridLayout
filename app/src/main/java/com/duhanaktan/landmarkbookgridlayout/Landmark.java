package com.duhanaktan.landmarkbookgridlayout;

import java.io.Serializable;

public class Landmark implements Serializable {

    String name;
    String city;
    int image;

    public Landmark(String name, String city, int image) {
        this.name = name;
        this.city = city;
        this.image = image;
    }
}
