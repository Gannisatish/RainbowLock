package hlsg.com.smartphonesecurityapp;

/**
 * Created by GanniSatish on 19/02/16.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GanniSatish on 16/02/16.
 */
public class DBHelperNew extends SQLiteOpenHelper{
    public DBHelperNew(Context context) {
        super(context, "MyDB2", null, 4);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE COLORVALUES (COLOR_NAME TEXT,COLOR_VALUE TEXT,PIN,TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS COLORVALUES");
        onCreate(db);
    }

    public void insertColors(String ColorName,String hexValue,String pin) {
        SQLiteDatabase database=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("COLOR_NAME",ColorName);
        contentValues.put("COLOR_VALUE",hexValue);
        contentValues.put("PIN", pin);
        database.insert("COLORVALUES", null, contentValues);
    }

    public List<ColorValues> getDataOfColors() {
        List<ColorValues> colorValuesList = new ArrayList<ColorValues>();
        // Select All Query
        String selectQuery = "SELECT * FROM COLORVALUES";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor!=null && cursor.getCount()>0 && cursor.moveToFirst()) {
            do {
                ColorValues colorValues = new ColorValues();
                colorValues.setID(cursor.getString(0));
                colorValues.setColorName(cursor.getString(1));
                colorValues.setPin(cursor.getString(2));
                // Adding contact to list
                colorValuesList.add(colorValues);
            } while (cursor.moveToNext());
        }

        // return contact list
        return colorValuesList;
    }
    public void delete() {
        SQLiteDatabase db=this.getWritableDatabase();
        db.execSQL("DELETE FROM COLORVALUES");
    }

}
