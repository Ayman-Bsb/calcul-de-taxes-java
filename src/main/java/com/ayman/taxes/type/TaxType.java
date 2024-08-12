package com.ayman.taxes.type;

public enum TaxType {
    BASIC(0.10),
    IMPORT(0.05);

    private final double rate;

    TaxType(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
