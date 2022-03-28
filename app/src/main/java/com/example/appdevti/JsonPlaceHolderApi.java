package com.example.appdevti;
import com.example.appdevti.models.itemFee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("itemFees")
    Call<List<itemFee>> getFees();
}



