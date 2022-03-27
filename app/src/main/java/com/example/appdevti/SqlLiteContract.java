package com.example.appdevti;

import android.provider.BaseColumns;

public class SqlLiteContract {
    //empty Constructor
    private SqlLiteContract(){

    }
    //subsclass to implement base column class
    public static class SqLiteEntry implements BaseColumns{

        //Primary Table FeeItem
        public static final String TABLE_NAME1 ="feeItem";
        public static final String COLUMN_Id ="Id";   //Used Across all time Tables
        public static final String COLUMN_name = "name";
        public static final String COLUMN_isInclusiveInAmount = "isInclusiveInAmount";
        public static final String COLUMN_hasProviderServiceCharge = "hasProviderServiceCharge";
        public static final String COLUMN_overrideBillerFee = "overrideBillerFee";
        public static final String COLUMN_vat = "vat";
        public static final String COLUMN_providerServiceCharge = "providerServiceCharge";
        public static final String COLUMN_taxAccount = "taxAccount";
        public static final String COLUMN_withholdingTax = "withholdingTax";
        public static final String COLUMN_NAME = "withholdingTaxAccount";
        public static final String COLUMN_excise = "excise";
        public static final String COLUMN_ItemFeeId = "ItemFeeId";
        public static final String COLUMN_isActive = "isActive";
        public static final String COLUMN_issueDate = "issueDate";
        public static final String COLUMN_feeId = "feeId";

        public static final String COLUMN_timestamp="Timestamp"; //Used Across all time Tables

        //Second Table payConfiguration
        public static final String TABLE_NAME2 ="payConfiguration";
         //Use   COLUMN_Id ="Id";  for Defualt ID
         //Use   COLUMN_feeId = "feeId"; for Relational column
        public static final String COLUMN2_source ="source";
        public static final String COLUMN2_payType ="payType";
        public static final String COLUMN2_payValue ="payValue";
        public static final String COLUMN2_maximumFeeBorn ="maximumFeeBorn";
        public static final String COLUMN2_minimumFeeBorn ="minimumFeeBorn";
        public static final String COLUMN2_itemFeeMapSettingId="itemFeeMapSettingId";
        public static final String COLUMN2_bandCode ="bandCode";
        public static final String COLUMN2_hasExcise ="hasExcise";
        public static final String COLUMN2_isPayVAT ="isPayVAT";
        public static final String COLUMN2_hasWithholdingTax ="hasWithholdingTax";
        public static final String COLUMN2_hasServiceCharge="hasServiceCharge";
         //USe COLUMN_timestamp="Timestamp" for TimeStamp


        //Third Table feeGroups
        public static final String TABLE_NAME3 ="feeGroups";
        //Use   COLUMN_Id ="Id";  for Defualt ID
        public static final String COLUMN3_itemFeeId ="itemFeeId";
        public static final String COLUMN3_feeGroupsId ="feeGroupsId";
        //use COLUMN_name = "name";
        public static final String COLUMN3_description ="description";
        public static final String COLUMN3_itemId ="itemId";
        public static final String COLUMN3_item ="item";
        public static final String COLUMN3_clientFees ="clientFees";
        public static final String COLUMN3_isActive ="isActive";
        public static final String COLUMN3_issueDate ="issueDate";
        //USe COLUMN_timestamp="Timestamp" for TimeStamp

        //Fourth Table itemFeeMapSettings
        public static final String TABLE_NAME4 ="itemFeeMapSettings";
        //Use   COLUMN_Id ="Id";  for Defualt ID
        //Use COLUMN3_itemFeeId ="itemFeeId"; for relation
        public static final String COLUMN3_itemFeeMap ="itemFeeMap";

    }
}

