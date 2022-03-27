package com.example.appdevti.models;

public class feeGroupsRecyclerModel {
    //variables;
    private String feeGroupId;
    private String feeGroupName;
    private String feeGroupIsActive;
    private String feeGroupIssueDate;
    private String feeGroupProviderServiceChargeAccount;
    private String feeGroupExcise;
    private String feeGroupWithholdingTax;

    //constructor
    public feeGroupsRecyclerModel(String feeGroupId,String feeGroupName,String feeGroupIsActive,String feeGroupIssueDate,
                                String feeGroupProviderServiceChargeAccount,String feeGroupExcise, String feeGroupWithholdingTax){

        this.feeGroupId = feeGroupId;
        this.feeGroupName =feeGroupName;
        this.feeGroupIsActive = feeGroupIsActive;
        this.feeGroupIssueDate =feeGroupIssueDate;
        this.feeGroupProviderServiceChargeAccount =feeGroupProviderServiceChargeAccount;
        this.feeGroupExcise= feeGroupExcise;
        this.feeGroupWithholdingTax =feeGroupWithholdingTax;
    }

    //get and set


    public String getFeeGroupId() {
        return feeGroupId;
    }

    public void setFeeGroupId(String feeGroupId) {
        this.feeGroupId = feeGroupId;
    }

    public String getFeeGroupName() {
        return feeGroupName;
    }

    public void setFeeGroupName(String feeGroupName) {
        this.feeGroupName = feeGroupName;
    }

    public String getFeeGroupIsActive() {
        return feeGroupIsActive;
    }

    public void setFeeGroupIsActive(String feeGroupIsActive) {
        this.feeGroupIsActive = feeGroupIsActive;
    }

    public String getFeeGroupIssueDate() {
        return feeGroupIssueDate;
    }

    public void setFeeGroupIssueDate(String feeGroupIssueDate) {
        this.feeGroupIssueDate = feeGroupIssueDate;
    }

    public String getFeeGroupProviderServiceChargeAccount() {
        return feeGroupProviderServiceChargeAccount;
    }

    public void setFeeGroupProviderServiceChargeAccount(String feeGroupProviderServiceChargeAccount) {
        this.feeGroupProviderServiceChargeAccount = feeGroupProviderServiceChargeAccount;
    }

    public String getFeeGroupExcise() {
        return feeGroupExcise;
    }

    public void setFeeGroupExcise(String feeGroupExcise) {
        this.feeGroupExcise = feeGroupExcise;
    }

    public String getFeeGroupWithholdingTax() {
        return feeGroupWithholdingTax;
    }

    public void setFeeGroupWithholdingTax(String feeGroupWithholdingTax) {
        this.feeGroupWithholdingTax = feeGroupWithholdingTax;
    }
}
