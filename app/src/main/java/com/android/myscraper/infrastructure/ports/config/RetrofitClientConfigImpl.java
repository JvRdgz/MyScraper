package com.android.myscraper.infrastructure.ports.config;

import com.android.myscraper.domain.utils.Constant;
import com.android.myscraper.infrastructure.adapters.config.RetrofitClientConfig;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientConfigImpl implements RetrofitClientConfig {
    @Override
    public Retrofit getClient() {
        return new Retrofit.Builder()
                .baseUrl(Constant.URI_API_ETHERSCAN)
                .addConverterFactory(GsonConverterFactory.create(
                        new GsonBuilder().serializeNulls().create()
                ))
                .build();
    }
}
