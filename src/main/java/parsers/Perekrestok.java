package parsers;

import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Perekrestok {
	
	private static Document getPerekrestok() throws IOException {
		String url = "https://www.perekrestok.ru/cat/search?search=%D1%81%D1%8B%D1%80&append=1&page=9";
		Document page = Jsoup.parse(new URL(url), 3000);
		System.out.println(page);
		return page;
		
	}
	
	public static void main(String args[]) throws IOException {
		getPerekrestok();
	}

}
