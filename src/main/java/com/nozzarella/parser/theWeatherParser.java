package com.nozzarella.parser;

import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class theWeatherParser {

	private static Document getWeatherPage() throws IOException {
		String url = "http://www.london-weather.info/";
		Document page = Jsoup.parse(new URL(url), 3000);
		return page;
	}

	// Создаём паттерн с регулярным выражением
	private static Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}");

	// Метод для вычленения даты из строки
	private static String getDateFromString(String stringDate) throws Exception {
		Matcher matcher = pattern.matcher(stringDate);
		if (matcher.find()) {
			return matcher.group();
		}
		throw new Exception("Can't extract date from string");
	}

	private static int printPartValues(Elements values, int index) {
		int iterationCount = 4;
		if (index == 0) {
			Element valueLn = values.get(3);
			boolean isMorning = valueLn.text().contains("Morning");

			if (isMorning) {
				iterationCount = 3;
			}
		}
		for (int i = 0; i < iterationCount; i++) {
			Element valueLine = values.get(index + i);
			for (Element td : valueLine.select("td")) {
				System.out.print(td.text() + "   ");
			}
			System.out.println();
		}
		return iterationCount;
	}

	public static void main(String[] args) throws Exception {
		Document page = getWeatherPage();
		Element tableWth = page.select("table[class=wt]").first();

		Elements names = tableWth.select("tr[class=wth]");
		Elements values = tableWth.select("tr[valign=top]");

		int index = 0; // valign top index

		for (Element name : names) {
			String dateString = name.select("th[id=dt]").text();
			String date = getDateFromString(dateString);
			System.out.println();
			System.out.println(date + "    Weather conditions	 Temp  Pressure Humidity	Wind");
			int iterationCount = printPartValues(values, index);
			index = index + iterationCount;
		}

	}

}
