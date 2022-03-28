package com.example.appdevti.api;

import com.example.appdevti.models.itemFee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AppDevTiApi {

    @GET("itemFee")
    Call<List<itemFee>> getFee();

}
