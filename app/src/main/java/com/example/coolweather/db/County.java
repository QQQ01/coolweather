package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {

    private int id;

    private String countyName;

    private int countyCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public int getCountyCode() {
        return countyCode;
    }
}
