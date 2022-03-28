package com.example.appdevti;
import com.example.appdevti.models.itemFee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {
    @GET("itemFees")
    Call<List<itemFee>> getFees();

    @GET("fee/{id}?getRelatedData=true")
    Call<List<itemFee>> getItemFee(@Path("id") int itemIdEntered);

}



