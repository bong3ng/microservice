package com.example.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange", url="http://localhost:8000")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-ex change/from/{from}/to/{to}")
    public CurrencyConversion retrievqersdeExchangeValue(
            @PathVariable String from, @PathVariable String to
    );
}
