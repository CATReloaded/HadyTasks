package com.andalus.hady;

import android.app.ActionBar;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;

import com.andalus.hady.DataWeather.WeatherData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    SearchView searchView;
    ProgressBar progressBar;
    Button searchbutton;
    String search;


    public static double convert(double fahrenheit) {


        return fahrenheit -273.15;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView = findViewById(R.id.search_bar);
        progressBar = findViewById(R.id.progress_circular);
        textView = findViewById(R.id.returndata);
        searchbutton = findViewById(R.id.button);


        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                progressBar.setVisibility(View.VISIBLE);
                ApiEndPoint endPoint = RetrofitClient.getclient().create(ApiEndPoint.class);
                Call<WeatherData> connect = endPoint.gWeatherData(searchView.getQuery().toString());
                connect.enqueue(new Callback<WeatherData>() {
                    @Override
                    public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {

                        String cityname = response.body().getName();
                        String country = response.body().getSys().getCountry();
                        Double tempfarh = response.body().getMain().getTemp();
                        int tempc = (int) convert(tempfarh);


                        progressBar.setVisibility(View.INVISIBLE);

                        textView.setText(cityname + "     " + tempc + "°C" + "        " + country);


                    }

                    @Override
                    public void onFailure(Call<WeatherData> call, Throwable t) {


                        progressBar.setVisibility(View.INVISIBLE);
                        textView.setText("error");

                    }
                });

            }
        });


    }
}
