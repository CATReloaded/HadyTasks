package com.andalus.hady;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit=null;

    public static Retrofit getclient() {




        if (retrofit==null)
        {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

            retrofit= new Retrofit.Builder()
                    .baseUrl("https://api.openweathermap.org/data/2.5/")
                    .client(client)
                    .addConverterFactory( GsonConverterFactory.create())
                    .build();


        }



        return retrofit;
    }
}