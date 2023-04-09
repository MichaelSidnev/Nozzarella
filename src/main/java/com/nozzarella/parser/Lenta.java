package com.nozzarella.parser;

import java.math.BigDecimal;

import org.json.JSONObject;

public class Lenta {

	public BigDecimal lentaLamber() {
		String argument = "{&quot;skus&quot;:[{&quot;webControlsShowType&quot;:1,&quot;quantity&quot;:&quot;0&quot;,&quot;promoStart&quot;:&quot;2023-04-07T02:00:00&quot;,&quot;promoEnd&quot;:&quot;2023-05-12T02:00:00&quot;,&quot;weightOptionsMax&quot;:[0.6],&quot;defaultSelectedWeightOptionIndex&quot;:0,&quot;stock&quot;:3,&quot;stockValue&quot;:&quot;many&quot;,&quot;preventIndexing&quot;:false,&quot;position&quot;:1,&quot;hasAdultContent&quot;:false,&quot;proProductType&quot;:&quot;Veterinary&quot;,&quot;isProCardSelected&quot;:false,&quot;brand&quot;:&quot;ЛАМБЕР&quot;,&quot;code&quot;:&quot;029772&quot;,&quot;title&quot;:&quot;Сыр полутвердый ЛАМБЕР 50%, без змж, весовой&quot;,&quot;subTitle&quot;:&quot;Россия &quot;,&quot;imageUrl&quot;:&quot;https://lenta.servicecdn.ru/globalassets/1/-/02/97/72/241694_2.png?preset=thumbnaillossy&quot;,&quot;skuUrl&quot;:&quot;/product/syr-lamber-polutverdyjj-50-ves-rossiya-1kg-029772/&quot;,&quot;gaCategory&quot;:&quot;Молоко, сыр, яйцо/Сыр/Эдам, Гауда, Тильзитер&quot;,&quot;isWeightProduct&quot;:true,&quot;isPromoForRegularPrice&quot;:false,&quot;hasDiscount&quot;:true,&quot;isEcomEnabled&quot;:true,&quot;isInFavorites&quot;:false,&quot;isAvailableForOrder&quot;:true,&quot;isDeliveryEnabled&quot;:false,&quot;isShowEcomCartControl&quot;:false,&quot;kppPageUrl&quot;:&quot;https://lenta.com/pokupatelyam/karta-pokupatelya/karta-postoyannogo-pokupatelya/&quot;,&quot;averageRating&quot;:5.0,&quot;commentsCount&quot;:2,&quot;showUnavailableToOrderForProError&quot;:false,&quot;unavailableToOrderForProErrorMessage&quot;:&quot;&quot;,&quot;isBlur&quot;:false,&quot;placeOutput&quot;:&quot;SearchResults&quot;,&quot;isShowOnePrice&quot;:false,&quot;regularPrice&quot;:{&quot;value&quot;:1126.39,&quot;integerPart&quot;:&quot;1 126&quot;,&quot;fractionPart&quot;:&quot;39&quot;},&quot;cardPrice&quot;:{&quot;value&quot;:899.99,&quot;integerPart&quot;:&quot;899&quot;,&quot;fractionPart&quot;:&quot;99&quot;},&quot;priceWithoutNds&quot;:{&quot;value&quot;:818.17,&quot;integerPart&quot;:&quot;818&quot;,&quot;fractionPart&quot;:&quot;17&quot;},&quot;badges&quot;:[],&quot;promotionType&quot;:1,&quot;promoPercent&quot;:20,&quot;hasPrices&quot;:true},{&quot;webControlsShowType&quot;:1,&quot;quantity&quot;:&quot;0&quot;,&quot;promoStart&quot;:&quot;2023-03-18T02:00:00&quot;,&quot;promoEnd&quot;:&quot;9999-12-31T23:59:59.9966667&quot;,&quot;weightOptionsMax&quot;:[],&quot;defaultSelectedWeightOptionIndex&quot;:0,&quot;stock&quot;:3,&quot;stockValue&quot;:&quot;many&quot;,&quot;preventIndexing&quot;:false,&quot;position&quot;:2,&quot;hasAdultContent&quot;:false,&quot;proProductType&quot;:&quot;Veterinary&quot;,&quot;isProCardSelected&quot;:false,&quot;brand&quot;:&quot;ЛАМБЕР&quot;,&quot;code&quot;:&quot;299121&quot;,&quot;title&quot;:&quot;Сыр ЛАМБЕР 50%, без змж, 230г&quot;,&quot;subTitle&quot;:&quot;Россия, 230 г&quot;,&quot;imageUrl&quot;:&quot;https://lenta.servicecdn.ru/globalassets/1/-/29/91/21/268790_3.png?preset=thumbnaillossy&quot;,&quot;skuUrl&quot;:&quot;/product/syr-lamber-50-rossiya-230g-299121/&quot;,&quot;gaCategory&quot;:&quot;Молоко, сыр, яйцо/Сыр/Эдам, Гауда, Тильзитер&quot;,&quot;isWeightProduct&quot;:false,&quot;isPromoForRegularPrice&quot;:false,&quot;hasDiscount&quot;:false,&quot;isEcomEnabled&quot;:true,&quot;isInFavorites&quot;:false,&quot;isAvailableForOrder&quot;:true,&quot;isDeliveryEnabled&quot;:false,&quot;isShowEcomCartControl&quot;:false,&quot;kppPageUrl&quot;:&quot;https://lenta.com/pokupatelyam/karta-pokupatelya/karta-postoyannogo-pokupatelya/&quot;,&quot;averageRating&quot;:0.0,&quot;commentsCount&quot;:0,&quot;showUnavailableToOrderForProError&quot;:false,&quot;unavailableToOrderForProErrorMessage&quot;:&quot;&quot;,&quot;isBlur&quot;:false,&quot;placeOutput&quot;:&quot;SearchResults&quot;,&quot;isShowOnePrice&quot;:false,&quot;regularPrice&quot;:{&quot;value&quot;:284.29,&quot;integerPart&quot;:&quot;284&quot;,&quot;fractionPart&quot;:&quot;29&quot;},&quot;cardPrice&quot;:{&quot;value&quot;:269.99,&quot;integerPart&quot;:&quot;269&quot;,&quot;fractionPart&quot;:&quot;99&quot;},&quot;priceWithoutNds&quot;:{&quot;value&quot;:245.45,&quot;integerPart&quot;:&quot;245&quot;,&quot;fractionPart&quot;:&quot;45&quot;},&quot;badges&quot;:[],&quot;promotionType&quot;:0,&quot;promoPercent&quot;:0,&quot;hasPrices&quot;:true},{&quot;webControlsShowType&quot;:1,&quot;quantity&quot;:&quot;0&quot;,&quot;promoStart&quot;:&quot;2023-04-07T02:00:00&quot;,&quot;promoEnd&quot;:&quot;2023-05-12T02:00:00&quot;,&quot;weightOptionsMax&quot;:[0.6],&quot;defaultSelectedWeightOptionIndex&quot;:0,&quot;stock&quot;:2,&quot;stockValue&quot;:&quot;enough&quot;,&quot;preventIndexing&quot;:false,&quot;position&quot;:3,&quot;hasAdultContent&quot;:false,&quot;proProductType&quot;:&quot;Veterinary&quot;,&quot;isProCardSelected&quot;:false,&quot;brand&quot;:&quot;ЛАМБЕР&quot;,&quot;code&quot;:&quot;079174&quot;,&quot;title&quot;:&quot;Сыр ЛАМБЕР Сливочный 55%, без змж, весовой&quot;,&quot;subTitle&quot;:&quot;Россия &quot;,&quot;imageUrl&quot;:&quot;https://lenta.servicecdn.ru/globalassets/1/-/07/91/74/271405_1.png?preset=thumbnaillossy&quot;,&quot;skuUrl&quot;:&quot;/product/syr-lamber-slivochnyjj-55-ves-rossiya-1kg-079174/&quot;,&quot;gaCategory&quot;:&quot;Молоко, сыр, яйцо/Сыр/Эдам, Гауда, Тильзитер&quot;,&quot;isWeightProduct&quot;:true,&quot;isPromoForRegularPrice&quot;:false,&quot;hasDiscount&quot;:true,&quot;isEcomEnabled&quot;:true,&quot;isInFavorites&quot;:false,&quot;isAvailableForOrder&quot;:true,&quot;isDeliveryEnabled&quot;:false,&quot;isShowEcomCartControl&quot;:false,&quot;kppPageUrl&quot;:&quot;https://lenta.com/pokupatelyam/karta-pokupatelya/karta-postoyannogo-pokupatelya/&quot;,&quot;averageRating&quot;:0.0,&quot;commentsCount&quot;:0,&quot;showUnavailableToOrderForProError&quot;:false,&quot;unavailableToOrderForProErrorMessage&quot;:&quot;&quot;,&quot;isBlur&quot;:false,&quot;placeOutput&quot;:&quot;SearchResults&quot;,&quot;isShowOnePrice&quot;:false,&quot;regularPrice&quot;:{&quot;value&quot;:1157.89,&quot;integerPart&quot;:&quot;1 157&quot;,&quot;fractionPart&quot;:&quot;89&quot;},&quot;cardPrice&quot;:{&quot;value&quot;:979.99,&quot;integerPart&quot;:&quot;979&quot;,&quot;fractionPart&quot;:&quot;99&quot;},&quot;priceWithoutNds&quot;:{&quot;value&quot;:890.90,&quot;integerPart&quot;:&quot;890&quot;,&quot;fractionPart&quot;:&quot;90&quot;},&quot;badges&quot;:[],&quot;promotionType&quot;:1,&quot;promoPercent&quot;:15,&quot;hasPrices&quot;:true},{&quot;webControlsShowType&quot;:1,&quot;quantity&quot;:&quot;0&quot;,&quot;promoStart&quot;:&quot;2023-04-07T02:00:00&quot;,&quot;promoEnd&quot;:&quot;2023-05-12T02:00:00&quot;,&quot;weightOptionsMax&quot;:[0.6],&quot;defaultSelectedWeightOptionIndex&quot;:0,&quot;stock&quot;:3,&quot;stockValue&quot;:&quot;many&quot;,&quot;preventIndexing&quot;:false,&quot;position&quot;:4,&quot;hasAdultContent&quot;:false,&quot;proProductType&quot;:&quot;Veterinary&quot;,&quot;isProCardSelected&quot;:false,&quot;brand&quot;:&quot;ЛАМБЕР&quot;,&quot;code&quot;:&quot;600223&quot;,&quot;title&quot;:&quot;Сыр полутвердый ЛАМБЕР 50% полшара, без змж, весовой&quot;,&quot;subTitle&quot;:&quot;Россия &quot;,&quot;imageUrl&quot;:&quot;https://lenta.servicecdn.ru/globalassets/1/-/60/02/23/405464.png?preset=thumbnaillossy&quot;,&quot;skuUrl&quot;:&quot;/product/syr-lamber-ptv-50-polshara-bez-zmzh-ves-rossiya-600223/&quot;,&quot;gaCategory&quot;:&quot;Молоко, сыр, яйцо/Сыр/Эдам, Гауда, Тильзитер&quot;,&quot;isWeightProduct&quot;:true,&quot;isPromoForRegularPrice&quot;:false,&quot;hasDiscount&quot;:true,&quot;isEcomEnabled&quot;:true,&quot;isInFavorites&quot;:false,&quot;isAvailableForOrder&quot;:true,&quot;isDeliveryEnabled&quot;:false,&quot;isShowEcomCartControl&quot;:false,&quot;kppPageUrl&quot;:&quot;https://lenta.com/pokupatelyam/karta-pokupatelya/karta-postoyannogo-pokupatelya/&quot;,&quot;averageRating&quot;:0.0,&quot;commentsCount&quot;:0,&quot;showUnavailableToOrderForProError&quot;:false,&quot;unavailableToOrderForProErrorMessage&quot;:&quot;&quot;,&quot;isBlur&quot;:false,&quot;placeOutput&quot;:&quot;SearchResults&quot;,&quot;isShowOnePrice&quot;:false,&quot;regularPrice&quot;:{&quot;value&quot;:1126.39,&quot;integerPart&quot;:&quot;1 126&quot;,&quot;fractionPart&quot;:&quot;39&quot;},&quot;cardPrice&quot;:{&quot;value&quot;:899.99,&quot;integerPart&quot;:&quot;899&quot;,&quot;fractionPart&quot;:&quot;99&quot;},&quot;priceWithoutNds&quot;:{&quot;value&quot;:818.17,&quot;integerPart&quot;:&quot;818&quot;,&quot;fractionPart&quot;:&quot;17&quot;},&quot;badges&quot;:[],&quot;promotionType&quot;:1,&quot;promoPercent&quot;:20,&quot;hasPrices&quot;:true},{&quot;webControlsShowType&quot;:1,&quot;quantity&quot;:&quot;0&quot;,&quot;promoStart&quot;:&quot;2023-03-16T02:00:00&quot;,&quot;promoEnd&quot;:&quot;9999-12-31T23:59:59.9966667&quot;,&quot;weightOptionsMax&quot;:[],&quot;defaultSelectedWeightOptionIndex&quot;:0,&quot;stock&quot;:2,&quot;stockValue&quot;:&quot;enough&quot;,&quot;preventIndexing&quot;:false,&quot;position&quot;:5,&quot;hasAdultContent&quot;:false,&quot;proProductType&quot;:&quot;Veterinary&quot;,&quot;isProCardSelected&quot;:false,&quot;brand&quot;:&quot;ЛАМБЕР&quot;,&quot;code&quot;:&quot;334139&quot;,&quot;title&quot;:&quot;Сыр ЛАМБЕР Тильзитер 50%, без змж, в нарезке, 150г&quot;,&quot;subTitle&quot;:&quot;Россия, 150 г&quot;,&quot;imageUrl&quot;:&quot;https://lenta.servicecdn.ru/globalassets/1/-/33/41/39/268791_2.png?preset=thumbnaillossy&quot;,&quot;skuUrl&quot;:&quot;/product/syr-lamber-tilziter-50-nar-rossiya-150g-334139/&quot;,&quot;gaCategory&quot;:&quot;Молоко, сыр, яйцо/Сыр/Эдам, Гауда, Тильзитер&quot;,&quot;isWeightProduct&quot;:false,&quot;isPromoForRegularPrice&quot;:false,&quot;hasDiscount&quot;:false,&quot;isEcomEnabled&quot;:true,&quot;isInFavorites&quot;:false,&quot;isAvailableForOrder&quot;:true,&quot;isDeliveryEnabled&quot;:false,&quot;isShowEcomCartControl&quot;:false,&quot;kppPageUrl&quot;:&quot;https://lenta.com/pokupatelyam/karta-pokupatelya/karta-postoyannogo-pokupatelya/&quot;,&quot;averageRating&quot;:0.0,&quot;commentsCount&quot;:0,&quot;showUnavailableToOrderForProError&quot;:false,&quot;unavailableToOrderForProErrorMessage&quot;:&quot;&quot;,&quot;isBlur&quot;:false,&quot;placeOutput&quot;:&quot;SearchResults&quot;,&quot;isShowOnePrice&quot;:false,&quot;regularPrice&quot;:{&quot;value&quot;:263.19,&quot;integerPart&quot;:&quot;263&quot;,&quot;fractionPart&quot;:&quot;19&quot;},&quot;cardPrice&quot;:{&quot;value&quot;:249.99,&quot;integerPart&quot;:&quot;249&quot;,&quot;fractionPart&quot;:&quot;99&quot;},&quot;priceWithoutNds&quot;:{&quot;value&quot;:227.26,&quot;integerPart&quot;:&quot;227&quot;,&quot;fractionPart&quot;:&quot;26&quot;},&quot;badges&quot;:[],&quot;promotionType&quot;:0,&quot;promoPercent&quot;:0,&quot;hasPrices&quot;:true}],&quot;pages&quot;:[],&quot;recipes&quot;:{&quot;recipesSearchResult&quot;:{&quot;recipes&quot;:[],&quot;totalCount&quot;:0,&quot;adsCount&quot;:0,&quot;selectedTags&quot;:[],&quot;isAutoRecipesSelection&quot;:false,&quot;tags&quot;:&quot;&quot;}},&quot;articles&quot;:{&quot;tagsTree&quot;:[],&quot;articlesSearchResult&quot;:{&quot;articles&quot;:[],&quot;totalCount&quot;:0,&quot;sorting&quot;:0}},&quot;siteSections&quot;:[],&quot;searchText&quot;:&quot;ламбер&quot;,&quot;skusCount&quot;:5,&quot;pagesCount&quot;:0,&quot;catalogUrl&quot;:&quot;/catalog/&quot;,&quot;sorting&quot;:{&quot;sortingTypes&quot;:[&quot;ByRelevance&quot;,&quot;ByCardPriceAsc&quot;,&quot;ByCardPriceDesc&quot;,&quot;ByPriority&quot;,&quot;ByRating&quot;],&quot;currentSortingType&quot;:&quot;ByRelevance&quot;},&quot;pageSize&quot;:24,&quot;totalPages&quot;:1,&quot;title&quot;:&quot;Результаты поиска: «ламбер»&quot;,&quot;nodesTitle&quot;:&quot;Pазделы&quot;,&quot;typeSearch&quot;:2,&quot;isCityWithOneStore&quot;:false,&quot;isStoreDifferentFromCurrent&quot;:false,&quot;storeAddress&quot;:&quot;&quot;,&quot;noticeStoreDifferentFromCurrent&quot;:&quot;Вы просматриваете товары для адреса &quot;,&quot;subTree&quot;:{&quot;name&quot;:&quot;Страница поиска по каталогу&quot;,&quot;url&quot;:&quot;/search/&quot;,&quot;isTreeRootOrGroup&quot;:true,&quot;childNodes&quot;:[{&quot;name&quot;:&quot;Молоко, сыр, яйцо&quot;,&quot;title&quot;:&quot;Молоко, сыр, яйцо&quot;,&quot;url&quot;:&quot;/search/?nodeCode=g604e486481b04594c32002c67a2b459a&quot;,&quot;code&quot;:&quot;g604e486481b04594c32002c67a2b459a&quot;,&quot;childNodes&quot;:[{&quot;name&quot;:&quot;Сыр&quot;,&quot;title&quot;:&quot;Сыр&quot;,&quot;url&quot;:&quot;/search/?nodeCode=c942fa267791d7e901389dd190d160fde&quot;,&quot;code&quot;:&quot;c942fa267791d7e901389dd190d160fde&quot;,&quot;catalogPageGroupType&quot;:&quot;PC&quot;,&quot;childNodes&quot;:[],&quot;selected&quot;:false,&quot;opened&quot;:false,&quot;preventIndexing&quot;:false}],&quot;selected&quot;:false,&quot;opened&quot;:false,&quot;imageUrl&quot;:&quot;https://lenta.servicecdn.ru/globalassets/1/3/-28.04/--3.jpg?preset=thumbnail&quot;,&quot;preventIndexing&quot;:false}],&quot;preventIndexing&quot;:false},&quot;preventIndexing&quot;:false,&quot;filters&quot;:{&quot;selectedFilters&quot;:[],&quot;allFiltersWithFacets&quot;:[]},&quot;limit&quot;:24,&quot;pricesRange&quot;:{&quot;minPrice&quot;:249,&quot;maxPrice&quot;:980},&quot;tags&quot;:{&quot;tags&quot;:[],&quot;selectedTag&quot;:&quot;&quot;},&quot;badges&quot;:{&quot;badges&quot;:[],&quot;selectedBadge&quot;:&quot;&quot;},&quot;breadcrumbs&quot;:{&quot;showDesktopContainer&quot;:false,&quot;elements&quot;:[{&quot;name&quot;:&quot;Главная&quot;,&quot;url&quot;:&quot;/&quot;},{&quot;name&quot;:&quot;Каталог&quot;,&quot;url&quot;:&quot;/catalog/&quot;},{&quot;name&quot;:&quot;Результаты поиска&quot;}]},&quot;recentSearch&quot;:[&quot;ламбер&quot;]}";
		boolean strictMode = true;
		String unescapedString = org.jsoup.parser.Parser.unescapeEntities(argument, strictMode);
		JSONObject obj = new JSONObject(unescapedString);
		BigDecimal lentaLamberPrice = obj.getJSONArray("skus").getJSONObject(3).getJSONObject("cardPrice")
				.getBigDecimal("value");
		return lentaLamberPrice;

	}

}
