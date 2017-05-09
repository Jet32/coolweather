package com.jet.jgq.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by jgq on 2017/5/9.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinecId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinecId() {
        return provinecId;
    }

    public void setProvinecId(int provinecId) {
        this.provinecId = provinecId;
    }
}
