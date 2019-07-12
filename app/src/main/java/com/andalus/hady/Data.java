package com.andalus.hady;

public class Data {
    private  String CityName;
    private  String Country;
    private  Double Temp;
    public  Data(String name,String country,Double temp)
    {
        CityName=name;
        Country=country;
        Temp=temp;

    }

    public Double getTemp() {
        return Temp;
    }

    public String getCityName() {
        return CityName;
    }

    public String getCountry() {
        return Country;
    }
}
