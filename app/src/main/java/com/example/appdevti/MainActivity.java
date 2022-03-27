package com.example.appdevti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText feeIdINput;
 Button viewData;
 String _feeIdINput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            feeIdINput=findViewById(R.id.etFeeGroupId);
            viewData=findViewById(R.id.btnViewData);

            viewData.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    submitFeeId();
                }
            });

    }
// submit details
    private void submitFeeId() {
        _feeIdINput=feeIdINput.getText().toString().trim();

        //Validation
        if (_feeIdINput.isEmpty()){
         //notification
            Toast.makeText(this, "Please Input a Fee Id", Toast.LENGTH_SHORT).show();
        }else {
            Intent intent = new Intent(MainActivity.this,feeItemDetails.class);
            //shared
            intent.putExtra("feeIdInput",_feeIdINput);
            startActivity(intent);
        }
    }

    public void ClearStorageAction(View view) {
        ///Code to Clear local Storage
    }


    public void ViewStorageAction(View view) {
        Intent intent = new Intent  (MainActivity.this,feeGroupsRecyclerViewActivity.class);
        startActivity(intent);
    }

    public void ViewDataAction(View view) {
    }
}