package com.ayman.taxes;

import com.ayman.taxes.model.Product;
import com.ayman.taxes.type.ProductType;
import com.ayman.taxes.service.ReceiptGenerator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products1 = Arrays.asList(
                new Product("Livre", 12.49, false, ProductType.BOOK),
                new Product("CD musical", 14.99, false, ProductType.OTHER),
                new Product("Barre de chocolat", 0.85, false, ProductType.FOOD)
        );

        List<Product> products2 = Arrays.asList(
                new Product("Boîte de chocolats importée", 10.00, true, ProductType.FOOD),
                new Product("Flacon de parfum importé", 47.50, true, ProductType.OTHER)
        );

        List<Product> products3 = Arrays.asList(
                new Product("Flacon de parfum importé", 27.99, true, ProductType.OTHER),
                new Product("Flacon de parfum", 18.99, false, ProductType.OTHER),
                new Product("Boîte de pilules contre la migraine", 9.75, false, ProductType.MEDICAL),
                new Product("Boîte de chocolats importés", 11.25, true, ProductType.FOOD)
        );

        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        System.out.println("### Output 1");
        receiptGenerator.execute(products1);
        System.out.println("\n### Output 2");
        receiptGenerator.execute(products2);
        System.out.println("\n### Output 3");
        receiptGenerator.execute(products3);
    }
}

