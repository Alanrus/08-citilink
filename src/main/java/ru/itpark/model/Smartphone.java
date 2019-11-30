package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Smartphone extends AbstractProduct {
    private String display;
    private String configuration;


    public Smartphone(long id, String name, int price, int rating, int numberReviews, int sumBonuses, int oldPrice, String MainCharacteristic, String category, String display, String configuration) {
        super(id, name, price, rating, numberReviews, sumBonuses, oldPrice, MainCharacteristic, category);
        this.display = display;
        this.configuration = configuration;
    }


    public String toString() {
        return super.getName();

    }

}
