package com.example.appdevti;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;

import java.lang.reflect.Method;
import java.util.ArrayList;

import retrofit2.Response;
import retrofit2.http.Tag;

public class feeItemDetails extends AppCompatActivity {

    //Variables
    String _feeIdInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_item_details);

        //getting Shared Data
        Intent intent =getIntent();
        _feeIdInput = intent.getStringExtra("feeIdInputIntent");

        //Querying SqlLite database for Data

//        Method methods= RetrofitClient.getRetrofitInstance().Create(Methods.class);
//        Call <Model> call methods.getAllData();
//
//        call.enqueue(new  callback<Model>()){
//            @Override
//            public void onResponse(Call<Model> call, Response<Model> response){
//                Log.e(TAG,"OnResponse: code:"+response.code());
//                ArrayList<Model.data> data = response.body.getData();
//
//                for (Model.data data1:data){
//                    Log.e(TAG, "onResponse: ",+data1.getfeeItems );
//                }
//
//            }
//
//            @Override
//            public void onFalure(Call<Model> call,Throwable t){
//                Log.e(TAG, "OnFaliuire"+t.getMessage());
//            }
//        }


    }



    private  void addFeeItemSQLite(){

    }
}