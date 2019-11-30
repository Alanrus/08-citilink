import ru.itpark.comparator.ProductByPriceAscComparator;
import ru.itpark.model.AbstractProduct;
import ru.itpark.model.Computer;
import ru.itpark.model.Smartphone;
import ru.itpark.service.ProductService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        ProductService service = new ProductService();
        service.add(new Smartphone(1,
                "Смартфон XIAOMI Redmi Note 7 64Gb, черный",
                12990, 5, 27, 130, 12990,
                "ОС Android 9, экран: 6.3, IPS, 2340×1080... 64Гб", "Смартфон", "6.3",
                "Qualcomm Snapdragon 660, 2200МГц, 8-ми ядерный"));

        service.add(new Smartphone(2,
                "Смартфон SAMSUNG Galaxy A50 64Gb, SM-A505F, черный",
                19990, 4, 18, 195, 19490,
                "ОС Android 9, экран: 6.4, Super AMOLED, 2220×1080...оперативная память: 4Гб, встроенная память: 64Гб",
                "Смартфон",
                "6.4", "Exynos 9610, 2300МГц, 8-ми ядерный"));

        service.add(new Computer(3, "Компьютер ACER Veriton ES2710G, черный", 27080, 5, 3, 0, 27080,
                "оперативная память: DIMM, DDR4 4096 Мб 2400 МГц...SATA III",
                "Компьютер", "Intel Core i3 6100", "DIMM, DDR4 4096 Мб 2400 МГц"));
        service.add(new Computer(4, "Компьютер IRU Office 110, черный", 12700, 2, 1, 0, 12700,
                "оперативная память: SO-DIMM, DDR3 4096 Мб...HDD: 500 Гб, 7200 об/мин",
                "Компьютер", "Intel Celeron J3355", "SO-DIMM, DDR3 4096 Мб 1600 МГц"));


        System.out.println(service.searchByName("IRU"));
        System.out.println(service.searchByCategory("Компьютер"));
        System.out.println(service.sortDefault());
        System.out.println(service.sortByRanking());
        System.out.println(service.sortByName());


    }
}
