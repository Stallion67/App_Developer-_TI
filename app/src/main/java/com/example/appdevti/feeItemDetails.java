package com.example.appdevti;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appdevti.models.itemFee;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class feeItemDetails extends AppCompatActivity {
    private TextView textViewResult;
    //Variables
    String _feeIdInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_item_details);

        textViewResult = findViewById(R.id.textViewResult);

        //getting Shared Data
        Intent intent =getIntent();
        _feeIdInput = intent.getStringExtra("feeIdInputIntent");

        //Querying SqlLite database for Data
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl("https://iswapigateway-develop.azurewebsites.net/qt-api/Item/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<itemFee>> call = jsonPlaceHolderApi.getFees();

        call.enqueue(new Callback<List<itemFee>>() {

            @Override
            public void onResponse(Call<List<itemFee>> call, Response<List<itemFee>> response) {

                if (!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }
                //on success message
                List<itemFee> itemFees = response.body();

                for (itemFee itemFee : itemFees) {
                    String content = "";
                    
//                    content += "ID: " + post.getId() + "\n";
//                    content += "User ID: " + post.getUserId() + "\n";
//                    content += "Title: " + post.getTitle() + "\n";
//                    content += "Text: " + post.getText() + "\n\n";

                    textViewResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<itemFee>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
    }



    private  void addFeeItemSQLite(){

    }
}