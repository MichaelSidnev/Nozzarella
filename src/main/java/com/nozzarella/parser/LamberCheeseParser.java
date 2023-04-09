package com.nozzarella.parser;

import java.io.IOException;
import java.net.URL;
import org.json.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LamberCheeseParser {

	private String getPage() throws Exception {
		String url = "https://chesom.com/syry_i_gastronomiya_dlya_gurmanov/katalog_syrov/tverdye_syry/gruyere-1/";
		Document page = Jsoup.connect(url)
				.get();
		Element element = page.getElementsByAttributeValue("class", "product-price")
				.first();
		Element priceElement = element.getElementsByAttributeValue("data-js-entity", "bx_117848907_60116_price_total")
				.first();
		String dateString = priceElement.text();
		String price = getPriceFromString(dateString);
		System.out.println(price);
		return price;
	}

	private Pattern pattern = Pattern.compile("\\d{3}");

	private String getPriceFromString(String stringDate) throws Exception {
		Matcher matcher = pattern.matcher(stringDate);
		if (matcher.find()) {
			return matcher.group();
		}
		throw new Exception("Can't extract price from string");
	}

}
