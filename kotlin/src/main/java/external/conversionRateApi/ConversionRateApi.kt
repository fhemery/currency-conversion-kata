package external.conversionRateApi

import external.CurrencyIsoCode

class ConversionRateApi {
    fun getRate(source: CurrencyIsoCode, target: CurrencyIsoCode): Double {
        throw RuntimeException("401 - Unauthorized, IP not recognized. Are you trying to call us via a unit test?")
    }
}