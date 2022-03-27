package com.example.appdevti;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SqliteDatabaseHelper  extends SQLiteOpenHelper {
    //variable to store my database name and version
    public static final String DATABASE_NAME="feeitemList.db";
    public static final int DATABASE_VERSION=1;
    private String SqLiteEntry;

    public SqliteDatabaseHelper(Context context) {

        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    //Creating the Database
    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_TABLE_1 ="CREATE TABLE "+
                SqlLiteContract.SqLiteEntry.TABLE_NAME1 + "(" +
                SqlLiteContract.SqLiteEntry._ID +"INTEGER PRIMARY KEY AUTOINCREMENT, " +
                SqlLiteContract.SqLiteEntry.COLUMN_Id +"INTEGER ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_name +" TEXT NOT NULL ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_isInclusiveInAmount +"TEXT ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_hasProviderServiceCharge +"TEXT ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_overrideBillerFee  +"TEXT ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_vat +"INTEGER ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_providerServiceCharge +"INTEGER ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_taxAccount +"TEXT ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_withholdingTax +"INTEGER ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_withholdingTaxAccount +"TEXT ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_excise +"INTEGER ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_ItemFeeId +" ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_isActive +" TEXT,"+
                SqlLiteContract.SqLiteEntry.COLUMN_issueDate +"TEXT ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_feeId +" INTEGER,"+
                SqlLiteContract.SqLiteEntry.COLUMN_timestamp +"TIMESTAMP DEFAULT CURRENT_TIMESTAMP"+
                ");";

        final String SQL_CREATE_TABLE_2 ="CREATE TABLE "+
                SqlLiteContract.SqLiteEntry.TABLE_NAME2 + "(" +
                SqlLiteContract.SqLiteEntry._ID +"INTEGER PRIMARY KEY AUTOINCREMENT, " +
                SqlLiteContract.SqLiteEntry.COLUMN_feeId +" INTEGER ,"+
                SqlLiteContract.SqLiteEntry.COLUMN2_source +" TEXT,"+
                SqlLiteContract.SqLiteEntry.COLUMN2_payType +" TEXT,"+
                SqlLiteContract.SqLiteEntry.COLUMN2_payValue +"INTEGER ,"+
                SqlLiteContract.SqLiteEntry.COLUMN2_maximumFeeBorn +" INTEGER,"+
                SqlLiteContract.SqLiteEntry.COLUMN2_minimumFeeBorn +" INTEGER ,"+
                SqlLiteContract.SqLiteEntry.COLUMN2_itemFeeMapSettingId +" INTEGER,"+
                SqlLiteContract.SqLiteEntry.COLUMN2_bandCode +"TEXT ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_feeId +"TEXT ,"+
                SqlLiteContract.SqLiteEntry.COLUMN2_hasExcise +" TEXT,"+
                SqlLiteContract.SqLiteEntry.COLUMN2_isPayVAT +" TEXT,"+
                SqlLiteContract.SqLiteEntry.COLUMN2_hasWithholdingTax +" TEXT ,"+
                SqlLiteContract.SqLiteEntry.COLUMN2_hasServiceCharge+" TEXT,"+
                SqlLiteContract.SqLiteEntry.COLUMN_timestamp +"TIMESTAMP DEFAULT CURRENT_TIMESTAMP"+
        ");";

        final String SQL_CREATE_TABLE_3 ="CREATE TABLE "+
                SqlLiteContract.SqLiteEntry.TABLE_NAME3 + "(" +
                SqlLiteContract.SqLiteEntry._ID +"INTEGER PRIMARY KEY AUTOINCREMENT, " +
                SqlLiteContract.SqLiteEntry.COLUMN_name +" TEXT,"+
                SqlLiteContract.SqLiteEntry.COLUMN3_description +" TEXT ,"+
                SqlLiteContract.SqLiteEntry.COLUMN3_itemId +"INTEGER ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_feeId +" INTEGER,"+
                SqlLiteContract.SqLiteEntry.COLUMN3_item +" TEXT,"+
                SqlLiteContract.SqLiteEntry.COLUMN3_clientFees +"TEXT ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_Id +" INTEGER,"+
                SqlLiteContract.SqLiteEntry.COLUMN3_isActive +"TEXT ,"+
                SqlLiteContract.SqLiteEntry.COLUMN3_issueDate +"TEXT ,"+
                SqlLiteContract.SqLiteEntry.COLUMN_timestamp +"TIMESTAMP DEFAULT CURRENT_TIMESTAMP"+

                ");";

        final String SQL_CREATE_TABLE_4 ="CREATE TABLE "+
                SqlLiteContract.SqLiteEntry.TABLE_NAME4 + "(" +
                SqlLiteContract.SqLiteEntry._ID +"INTEGER PRIMARY KEY AUTOINCREMENT, " +
                SqlLiteContract.SqLiteEntry.COLUMN_Id +" INTEGER,"+
                SqlLiteContract.SqLiteEntry.COLUMN_feeId +" INTEGER,"+
                SqlLiteContract.SqLiteEntry.COLUMN4_itemFeeMap +" TEXT,"+
                SqlLiteContract.SqLiteEntry.COLUMN_timestamp +"TIMESTAMP DEFAULT CURRENT_TIMESTAMP"+
                ");";

        db.execSQL(SQL_CREATE_TABLE_1);
        db.execSQL(SQL_CREATE_TABLE_2);
        db.execSQL(SQL_CREATE_TABLE_3);
        db.execSQL(SQL_CREATE_TABLE_4);
    }

    //This is for deleting the Database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ SqlLiteContract.SqLiteEntry.TABLE_NAME1 );
        db.execSQL("DROP TABLE IF EXISTS "+ SqlLiteContract.SqLiteEntry.TABLE_NAME2 );
        db.execSQL("DROP TABLE IF EXISTS "+ SqlLiteContract.SqLiteEntry.TABLE_NAME3 );
        db.execSQL("DROP TABLE IF EXISTS "+ SqlLiteContract.SqLiteEntry.TABLE_NAME4 );
        onCreate(db);

    }
}
