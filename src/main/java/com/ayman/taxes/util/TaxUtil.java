package com.ayman.taxes.util;

public class TaxUtil {
    public static double roundToNearestFiveCents(double value) {
        return Math.ceil(value * 20.0) / 20.0;
    }
}

