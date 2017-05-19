package com.bakerbeach.market.index.model;

import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public interface IndexContext {

	String getShopCode();

	List<Locale> getLocales();

	List<Currency> getCurrencies();

	void setCurrencies(List<Currency> currencies);

	List<String> getPriceGroups();

	Map<String, String> getSolrUrls();

}