package hlsg.com.smartphonesecurityapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;

import java.util.List;
import java.util.ArrayList;


/**
 * Created by GanniSatish on 16/02/16.
 */
public class DBHelper extends SQLiteOpenHelper{

    String Create_Table="CREATE TABLE COLORS (SECURITY_QUESTION TEXT,ANSWER TEXT,PHONE_NUMBER TEXT)";

    public DBHelper(Context context) {
        super(context, "MyDB", null, 4);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Create_Table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS COLORS");
        onCreate(db);
    }

    public void addQuestions(String quest, String ans, String number) {

        SQLiteDatabase database=this.getWritableDatabase();

        ContentValues contentValues=new ContentValues();
        contentValues.put("SECURITY_QUESTION",quest);
        contentValues.put("ANSWER",ans);
        contentValues.put("PHONE_NUMBER",number);
        database.insert("COLORS", null, contentValues);
    }

    public List<Questions> getData() {
        List<Questions> contactList = new ArrayList<Questions>();
        // Select All Query
        String selectQuery = "SELECT * FROM COLORS";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Questions contact = new Questions();
                contact.setID(cursor.getString(0));
                contact.setName(cursor.getString(1));
                contact.setPhoneNumber(cursor.getString(2));
                // Adding contact to list
                contactList.add(contact);
            } while (cursor.moveToNext());
        }

        // return contact list
        return contactList;
    }
    public void delete() {
        SQLiteDatabase db=this.getWritableDatabase();
        db.execSQL("DELETE FROM COLORS");
    }
}
