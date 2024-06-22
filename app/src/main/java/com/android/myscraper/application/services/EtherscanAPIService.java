package com.android.myscraper.application.services;

import com.android.myscraper.domain.service.WalletFetchResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EtherscanAPIService {

    /**
     * en el @GET("") se supone que va la siguiente parte de la URL de la API. En este caso lo que hay que investigar
     * es la diferencia entre las querys que se especifican como parámetros en el método y meterlos directamente en este GET("")
     */
    @GET("api")
    Call<WalletFetchResult> getHistoricalWalletBalance(@Query("module")String modules, @Query("action")String account,
                                                       @Query("address")String address, @Query("startblock")Integer startBlock,
                                                       @Query("endblock")Integer endBlock, @Query("page")Integer page,
                                                       @Query("offset")Integer offset, @Query("sort")String sort,
                                                       @Query("apikey")String apikey);

}
