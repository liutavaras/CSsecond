package com.example.liutaurasmazonas.cslogintrying.data;

import org.json.JSONObject;

import yahoofinance.Stock;
import yahoofinance.quotes.stock.StockQuote;

/**
 * Created by Liutauras Mazonas on 3/26/2017.
 */

public interface JSONPopulator {

    void populate(Stock quote);

}
