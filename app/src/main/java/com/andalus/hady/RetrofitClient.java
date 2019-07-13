package com.andalus.hady;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient extends Application {

    private static Retrofit retrofit = null;

    public static Retrofit getclient() {


        if (retrofit == null) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request();
                    HttpUrl url = request
                            .url()
                            .newBuilder()
                            .addQueryParameter("APPID", Keys.API_KEY)
                            .build();
                    request = request.newBuilder().url(url).build();
                    return chain.proceed(request);

                }
            }).addInterceptor(interceptor).build();

            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.openweathermap.org/data/2.5/")
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


        }


        return retrofit;
    }
}
