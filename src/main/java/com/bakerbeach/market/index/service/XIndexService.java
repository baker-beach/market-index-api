package com.bakerbeach.market.index.service;

import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.bakerbeach.market.index.model.IndexContext;
import com.bakerbeach.market.xcatalog.model.Product;
import com.bakerbeach.market.xcatalog.model.Product.Status;

public interface XIndexService {

	void index(List<Product> products, Status status, Date lastUpdate, IndexContext context);

	void index(List<Product> products, String code, Product.Status status, Date lastUpdate, List<Locale> locales,
			List<Currency> currencies, List<String> priceGroups);

	void delete(List<String> codes, String solrCode, String status);

	void delete(String codes, String solrCode, String status);

}
