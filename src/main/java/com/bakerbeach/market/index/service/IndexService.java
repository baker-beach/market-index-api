package com.bakerbeach.market.index.service;

import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.bakerbeach.market.catalog.model.RawProduct;

public interface IndexService {

	void index(List<RawProduct> products, String code, String status, Date lastUpdate, List<Locale> locales,
			List<Currency> currencies, List<String> priceGroups);

	void index(RawProduct product, String code, String status, Date lastUpdate, List<Locale> locales,
			List<Currency> currencies, List<String> priceGroups);

}
