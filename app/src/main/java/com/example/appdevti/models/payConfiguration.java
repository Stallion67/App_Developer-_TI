package com.example.appdevti.models;

public class payConfiguration {

    private String source;
    private String payType;
    private String payValue;
    private String maximumFeeBorn;
    private String minimumFeeBorn;
    private String itemFeeMapSettingId;
    private String bandCode;
    private String hasExcise;
    private String isPayVAT;
    private String hasWithholdingTax;
    private String hasServiceCharge;

    public String getSource() {
        return source;
    }

    public String getPayType() {
        return payType;
    }

    public String getPayValue() {
        return payValue;
    }

    public String getMaximumFeeBorn() {
        return maximumFeeBorn;
    }

    public String getMinimumFeeBorn() {
        return minimumFeeBorn;
    }

    public String getItemFeeMapSettingId() {
        return itemFeeMapSettingId;
    }

    public String getBandCode() {
        return bandCode;
    }

    public String getHasExcise() {
        return hasExcise;
    }

    public String getIsPayVAT() {
        return isPayVAT;
    }

    public String getHasWithholdingTax() {
        return hasWithholdingTax;
    }

    public String getHasServiceCharge() {
        return hasServiceCharge;
    }
}
