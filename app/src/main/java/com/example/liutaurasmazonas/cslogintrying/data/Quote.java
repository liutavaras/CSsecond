package com.example.liutaurasmazonas.cslogintrying.data;

import org.json.JSONObject;

import java.math.BigDecimal;

import yahoofinance.Stock;

/**
 * Created by Liutauras Mazonas on 3/26/2017.
 */

public class Quote implements JSONPopulator {

    private Quote quote;

    private String Name;
    private String Symbol;
    private BigDecimal realtime_price;
    private BigDecimal Change;
    private BigDecimal realtime_chg_percent;
    private long Volume;
    private BigDecimal PERatio;
    private BigDecimal DaysHigh;
    private BigDecimal DaysLow;
    private BigDecimal MarketCapitalization;

    public String getName() {
        return Name;
    }

    public String getSymbol() {
        return Symbol;
    }

    public BigDecimal getRealtime_price() {
        return realtime_price;
    }

    public BigDecimal getChange() {
        return Change;
    }

    public BigDecimal getRealtime_chg_percent() {
        return realtime_chg_percent;
    }

    public long getVolume() {
        return Volume;
    }

    public BigDecimal getPERatio() {
        return PERatio;
    }

    public BigDecimal getDaysHigh() {
        return DaysHigh;
    }

    public BigDecimal getDaysLow() {
        return DaysLow;
    }

    public BigDecimal getMarketCapitalization() {
        return MarketCapitalization;
    }

    @Override
    public void populate(Stock data) {

        Name = data.getName();
        Symbol = data.getSymbol();
        realtime_price = data.getQuote().getPrice();
        Change = data.getQuote().getChange();
        realtime_chg_percent = data.getQuote().getChangeInPercent();
        Volume = data.getQuote().getVolume();
        PERatio = data.getStats().getPe();
        DaysHigh = data.getQuote().getDayHigh();
        DaysLow = data.getQuote().getDayLow();
        MarketCapitalization = data.getStats().getMarketCap();


    /*Name = data.optString("Name");
    Symbol = data.optString("Symbol");
    realtime_price = data.optInt("realtime_price");
    Change = data.optInt("Change");
    realtime_chg_percent = data.optInt("realtime_chg_percent");
    Volume = data.optInt("Volume");
    PERatio = data.optInt("PERatio");
    DaysHigh = data.optInt("DaysHigh");
    DaysLow = data.optInt("DaysLow");
    MarketCapitalization = data.optString("MarketCapitalization");*/

    }
}
