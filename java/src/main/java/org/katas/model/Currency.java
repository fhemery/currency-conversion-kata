package org.katas.model;

import org.katas.external.CurrencyIsoCode;

public enum Currency {
    Euro("€"),
    Dollar("$"),
    Pound("£"),
    Yen("¥");

    Currency(String symbol) {}

    public CurrencyIsoCode toIsoCode() {
        return switch (this) {
            case Euro -> CurrencyIsoCode.EUR;
            case Dollar -> CurrencyIsoCode.USD;
            case Pound -> CurrencyIsoCode.GBP;
            case Yen -> CurrencyIsoCode.JPY;
        };
    }
}
