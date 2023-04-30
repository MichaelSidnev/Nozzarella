package parsers;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;

import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Somelie {

	public Element SomelieParse() throws IOException {
		String url = "https://nn.chesom.com/syry_i_gastronomiya_dlya_gurmanov/katalog_syrov/tverdye_syry/";
		Document page = Jsoup.parse(new URL(url), 3000);
		Element catalog = page.select("div[class=catalog]").first();
		Element item = catalog.select("div[class=catalog-item one-col]").get(0);
		return item;
	}

	public BigDecimal somelieCheesePrice(Element item) {

		Element itemPrice = item.select("div[class=catalog-flex]").get(0);
		String stringPrice = itemPrice.select("span[class=price]").get(0).text();
		BigDecimal price = new BigDecimal(stringPrice);
		return price;
	}

	public String somelieCheeseProductName(Element item) {
		Element itemText = item.select("div[class=catalog-item-name-cont new-item]").get(0);
		String name = itemText.select("h3").text();
		return name;
	}

	public String somelieCheeseCountry() {
		return "Швейцария";
	}

	

}
