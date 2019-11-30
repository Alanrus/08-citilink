package ru.itpark.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itpark.comparator.ProductByNameAscComparator;
import ru.itpark.comparator.ProductByPriceAscComparator;
import ru.itpark.comparator.ProductByRankingAscComparator;
import ru.itpark.model.AbstractProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
@Data

public class ProductService {
    private final List<AbstractProduct> products = new ArrayList<>();

    public void add(AbstractProduct product) {
        products.add(product);
    }

    public List<AbstractProduct> searchByName(String name) {
        List<AbstractProduct> result = new ArrayList<>();
        for (AbstractProduct product : products) {
            if (product.getName().contains(name)) {
                result.add(product);
            }
        }
        Collections.sort(result, new ProductByNameAscComparator());
        return result;
    }

    public List<AbstractProduct> searchByCategory(String category) {
        List<AbstractProduct> result = new ArrayList<>();
        for (AbstractProduct product : products) {
            if (product.getCategory().contains(category)) {
                result.add(product);
            }

        }
        Collections.sort(result, new ProductByNameAscComparator());
        return result;
    }


    public List<AbstractProduct> sort(Comparator<AbstractProduct> comparator) {
        List<AbstractProduct> result = new ArrayList<>(products);
        Collections.sort(result, comparator);
        return result;
    }

    public List<AbstractProduct> sortDefault() {
        return sort(new ProductByPriceAscComparator());
    }

    public List<AbstractProduct> sortByRanking() {
        return sort(new ProductByRankingAscComparator());

    }

    public List<AbstractProduct> sortByName() {
        return sort(new ProductByNameAscComparator());
    }
}



