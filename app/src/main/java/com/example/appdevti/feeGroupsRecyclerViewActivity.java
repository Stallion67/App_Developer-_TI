package com.example.appdevti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.appdevti.adapters.feeGroupsRecyclerAdapter;
import com.example.appdevti.models.feeGroupsRecyclerModel;

import java.util.ArrayList;

public class feeGroupsRecyclerViewActivity extends AppCompatActivity {
    // decladre the recyler view
    RecyclerView recyclerView;
    //declare adpater
    feeGroupsRecyclerAdapter feeGroupsRecyclerAdapter;
    //layoutmanager
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_groups_recycler_view);

        //setting the onCreate List
        ArrayList<feeGroupsRecyclerModel> feeGroupsRecyclerModels =new ArrayList<>();

        //adding info using arrayList reference
        feeGroupsRecyclerModels.add(new feeGroupsRecyclerModel("30119","Mock MTN Airtime fees","true","26-03-2022","7687847","0","0"));
        feeGroupsRecyclerModels.add(new feeGroupsRecyclerModel("30112","Mock MTN Airtime fees Test","true","26-03-2022","7687847","0","0"));

        //populate the recycler View
        recyclerView =findViewById(R.id.recyclerFeeGroups);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);

        //creating a new instance of the adapter
        feeGroupsRecyclerAdapter = new feeGroupsRecyclerAdapter(this,feeGroupsRecyclerModels);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(feeGroupsRecyclerAdapter);

    }
}