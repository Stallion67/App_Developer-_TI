package com.example.appdevti.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdevti.R;
import com.example.appdevti.models.feeGroupsRecyclerModel;

import java.util.ArrayList;

public class feeGroupsRecyclerAdapter extends RecyclerView.Adapter<feeGroupsRecyclerAdapter.RecyclerViewHolder> {
    //Array List soting info
    private ArrayList<feeGroupsRecyclerModel> feeGroupsRecyclerModels;
    Context context;

    //Constructor
    public feeGroupsRecyclerAdapter(Context context,ArrayList<feeGroupsRecyclerModel> feeGroupsRecyclerModelArrayList){
        this.context =context;
        feeGroupsRecyclerModels =feeGroupsRecyclerModelArrayList;
    }

    //Creating a new Holder
    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        //declaring the views
        TextView id,name,isActive,issueDate
                ,providerServiceChargeAccount,excise,withholdingTax;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            id=itemView.findViewById(R.id.feeGroupId);
            name=itemView.findViewById(R.id.feeGroupName);
            isActive=itemView.findViewById(R.id.feeGroupIsActive);
            issueDate=itemView.findViewById(R.id.feeGroupIssueDate);
            providerServiceChargeAccount=itemView.findViewById(R.id.feeGroupproviderServiceChargeAccount);
            excise=itemView.findViewById(R.id.feeGroupexercise);
            withholdingTax=itemView.findViewById(R.id.feeGroupWithholdingTax);
        }
    }

    @NonNull
    @Override
    //inflating the recycled Item Layout
    public feeGroupsRecyclerAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fee_goups_recycler_item,parent,false);
        feeGroupsRecyclerAdapter.RecyclerViewHolder recyclerViewHolder = new feeGroupsRecyclerAdapter.RecyclerViewHolder(v); //new instance
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull feeGroupsRecyclerAdapter.RecyclerViewHolder holder, int position) {
        //Creating reference to items in Array List and Sto them inside te position of the item in the list
         final feeGroupsRecyclerModel feeGroupsRecyclerModel = feeGroupsRecyclerModels.get(position);

         //setting views to recycled Item
        holder.id.setText(feeGroupsRecyclerModel.getFeeGroupId());
        holder.name.setText(feeGroupsRecyclerModel.getFeeGroupName());
        holder.isActive.setText(feeGroupsRecyclerModel.getFeeGroupIsActive());
        holder.issueDate.setText(feeGroupsRecyclerModel.getFeeGroupIssueDate());
        holder.providerServiceChargeAccount.setText(feeGroupsRecyclerModel.getFeeGroupProviderServiceChargeAccount());
        holder.excise.setText(feeGroupsRecyclerModel.getFeeGroupExcise());
        holder.withholdingTax.setText(feeGroupsRecyclerModel.getFeeGroupWithholdingTax());

    }

    @Override
    public int getItemCount() {
        return feeGroupsRecyclerModels.size();
    }
}
