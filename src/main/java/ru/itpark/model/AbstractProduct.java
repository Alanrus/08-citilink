package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AbstractProduct {
    private long id;
    private String name;
    private int price;
    private int rating;
    private int numberReviews;
    private int sumBonuses;
    private int oldPrice;
    private String MainCharacteristic;
    private String category;


}
