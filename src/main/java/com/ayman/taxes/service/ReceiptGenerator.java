package com.ayman.taxes.service;

import com.ayman.taxes.model.Product;

import java.util.List;

public class ReceiptGenerator {
    public void execute(List<Product> products) {
        double totalTax = 0.0;
        double totalPrice = 0.0;

        for (Product product : products) {
            double tax = TaxCalculator.execute(product);
            double priceWithTax = product.getPrice() + tax;
            totalTax += tax;
            totalPrice += priceWithTax;
            System.out.println(product.getName() + ": " + String.format("%.2f", priceWithTax));
        }

        System.out.println("Montant des taxes : " + String.format("%.2f", totalTax));
        System.out.println("Total : " + String.format("%.2f", totalPrice));
    }
}

