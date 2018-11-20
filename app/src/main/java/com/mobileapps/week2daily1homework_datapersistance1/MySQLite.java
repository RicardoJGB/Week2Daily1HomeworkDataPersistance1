package com.mobileapps.week2daily1homework_datapersistance1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.mobileapps.week2daily1homework_datapersistance1.Constants.USER_NAME;

public class MySQLite extends SQLiteOpenHelper {

    public MySQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + Constants.DATABASE_NAME + Constants.TABLE_NAME + "(" + USER_NAME + " TEXT PRIMARY KEY, "
                + " TEXT)";
        db.execSQL(createTableQuery);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
