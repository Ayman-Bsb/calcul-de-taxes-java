package com.ayman.taxes.service;

import com.ayman.taxes.model.Product;
import com.ayman.taxes.type.TaxType;
import com.ayman.taxes.util.TaxUtil;

public class TaxCalculator {
    // Méthode pour calculer la taxe totale applicable sur un produit
    public static double execute(Product product) {
        double tax = 0.0;
        if (!product.getType().isExempt()) {
            tax += product.getPrice() * TaxType.BASIC.getRate();
        }
        if (product.isImported()) {
            tax += product.getPrice() * TaxType.IMPORT.getRate();
        }
        return TaxUtil.roundToNearestFiveCents(tax);
    }
}

