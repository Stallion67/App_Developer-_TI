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
    int SentID;
    private JsonPlaceHolderApi jsonPlaceHolderApi;

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

         jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<itemFee>> call = jsonPlaceHolderApi.getFees();

        getItemFee();
    }

    private void getItemFee(){
        Call<List<itemFee>> call= jsonPlaceHolderApi.getItemFee(Integer.parseInt( _feeIdInput));

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

                    content += "name :" + itemFee.getName() + "\n";
                    content += "payConfiguration :" + itemFee.getPayConfiguration() + "\n";
                    content += "isInclusiveInAmount :" + itemFee.getIsInclusiveInAmount() + "\n";
                    content += "hasProviderServiceCharge :" + itemFee.getHasProviderServiceCharge() + "\n";
                    content += "hasProviderServiceCharge :" + itemFee.getHasProviderServiceCharge() + "\n";
                    content += "overrideBillerFee :" + itemFee.getOverrideBillerFee()+ "\n";
                    content += "providerServiceCharge :" + itemFee.getProviderServiceCharge() + "\n";
                    content += "taxAccount :" + itemFee.getTaxAccount() + "\n";
                    content += "withholdingTax :" + itemFee.getWithholdingTax() + "\n";
                    content += "withholdingTaxAccount :" + itemFee.getWithholdingTaxAccount()+ "\n";
                    content += "excise :" + itemFee.getExcise() + "\n";
                    content += "exciseTaxAccount :" + itemFee.getExciseTaxAccount() + "\n";
                    content += "providerServiceChargeAccount :" + itemFee.getProviderServiceChargeAccount() + "\n";
                    content += "id:" + itemFee.getId() + "\n";
                    content += "isActive :" + itemFee.getIsActive() + "\n";
                    content += "issueDate :" + itemFee.getIssueDate() + "\n";

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