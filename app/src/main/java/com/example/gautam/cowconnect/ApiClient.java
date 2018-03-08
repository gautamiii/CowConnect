package com.example.gautam.cowconnect;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Gautam on 2/17/2018.
 */

public class ApiClient {

    public static final String base_url = "http://uicreations.com/mypro/db_mypro/";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient() {
        if (retrofit == null) {

            retrofit = new Retrofit.Builder().baseUrl(base_url).addConverterFactory(GsonConverterFactory.create()).build();
        }

        return retrofit;
    }
}
