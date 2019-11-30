package ru.itpark.comparator;

import ru.itpark.model.AbstractProduct;

import java.util.Comparator;

public class ProductByRankingAscComparator implements Comparator<AbstractProduct> {
    public int compare(AbstractProduct o1, AbstractProduct o2) {
        return o1.getRating() - o2.getRating();
    }
}
