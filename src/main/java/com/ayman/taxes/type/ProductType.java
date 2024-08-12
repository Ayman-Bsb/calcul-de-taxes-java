package com.ayman.taxes.type;

public enum ProductType {
    BOOK(true),
    FOOD(true),
    MEDICAL(true),
    OTHER(false);

    private final boolean isExempt;

    ProductType(boolean isExempt) {
        this.isExempt = isExempt;
    }

    public boolean isExempt() {
        return isExempt;
    }
}
