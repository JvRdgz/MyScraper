package com.android.myscraper.application.ports;

import com.android.myscraper.domain.dtos.Module;
import com.android.myscraper.domain.dtos.WalletFetchResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EtherscanAPIService {

    /**
     * en el @GET("") se supone que va la siguiente parte de la URL de la API. En este caso lo que hay que investigar
     * es la diferencia entre las querys que se especifican como parámetros en el método y meterlos directamente en este GET("")
     */
    @GET("api")
    Call<WalletFetchResult> getHistoricalWalletBalance(@Query("module") Module module, @Query("action"))

}
