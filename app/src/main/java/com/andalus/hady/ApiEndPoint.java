package com.andalus.hady;

import com.andalus.hady.DataWeather.WeatherData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;


public interface ApiEndPoint {


    @GET("weather")
        Call<WeatherData> gWeatherData(@Query("q") String Cityname, @Query("APPID") String ApiKey);



}
