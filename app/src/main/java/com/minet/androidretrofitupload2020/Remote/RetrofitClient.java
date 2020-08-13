package com.minet.androidretrofitupload2020.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {
    private static  Retrofit retrofitClient = null;

    public static Retrofit getClient(String baseUrl)
    {
        if (retrofitClient == null)
        {
            retrofitClient = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofitClient;
    }
}
