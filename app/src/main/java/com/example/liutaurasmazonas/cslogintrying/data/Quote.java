package com.example.liutaurasmazonas.cslogintrying.data;

import org.json.JSONObject;

/**
 * Created by Liutauras Mazonas on 3/26/2017.
 */

public class Quote implements JSONPopulator {

    private Quote quote;

    private String Name;
    private String Symbol;
    private int realtime_price;
    private int Change;
    private int realtime_chg_percent;
    private int Volume;
    private int PERatio;
    private int DaysHigh;
    private int DaysLow;
    private String MarketCapitalization;

    public String getName() {
        return Name;
    }

    public String getSymbol() {
        return Symbol;
    }

    public int getRealtime_price() {
        return realtime_price;
    }

    public int getChange() {
        return Change;
    }

    public int getRealtime_chg_percent() {
        return realtime_chg_percent;
    }

    public int getVolume() {
        return Volume;
    }

    public int getPERatio() {
        return PERatio;
    }

    public int getDaysHigh() {
        return DaysHigh;
    }

    public int getDaysLow() {
        return DaysLow;
    }

    public String getMarketCapitalization() {
        return MarketCapitalization;
    }

    @Override
    public void populate(JSONObject data) {

    Name = data.optString("Name");
    Symbol = data.optString("Symbol");
    realtime_price = data.optInt("realtime_price");
    Change = data.optInt("Change");
    realtime_chg_percent = data.optInt("realtime_chg_percent");
    Volume = data.optInt("Volume");
    PERatio = data.optInt("PERatio");
    DaysHigh = data.optInt("DaysHigh");
    DaysLow = data.optInt("DaysLow");
    MarketCapitalization = data.optString("MarketCapitalization");

    }
}
