package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Computer extends AbstractProduct {
    private String processor;
    private String ram;

    public Computer(long id, String name, int price, int rating, int numberReviews, int sumBonuses, int oldPrice, String MainCharacteristic, String category, String processor, String ram) {
        super(id, name, price, rating, numberReviews, sumBonuses, oldPrice, MainCharacteristic, category);
        this.processor = processor;
        this.ram = ram;
    }


    public String toString() {
        return super.getName();
    }
}
