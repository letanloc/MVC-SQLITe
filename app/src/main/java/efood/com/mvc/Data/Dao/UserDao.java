package efood.com.mvc.Data.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import efood.com.mvc.Data.Dbhelper;
import efood.com.mvc.Data.Namedefault;
import efood.com.mvc.Model.People;

/**
 * Created by loc on 13/04/2016.
 */
public class UserDao implements Namedefault {
    SQLiteDatabase db;
    ArrayList<People> list;

    public UserDao(Context context) {
        Dbhelper dbhelper = new Dbhelper(context);
        db = dbhelper.getWritableDatabase();
        list = new ArrayList<>();
    }

    public long InsertUser(People user) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Username, user.getUsername());
        contentValues.put(Password, user.getPassword());
        return db.insert(USER, null, contentValues);
    }

    public int Delete(int id) {
        return db.delete(USER, Id + "  = ? ", new String[]{id + ""});
    }

    public int Update(People user) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Username, user.getUsername());
        contentValues.put(Password, user.getPassword());
        return db.update(USER, null, Id + " = ? ", new String[]{user.getId() + ""});
    }

    public ArrayList<People> getAll() {
        String Select = "Select  * from " + USER;
        Cursor cursor = db.rawQuery(Select, null);
        if (cursor.moveToFirst()) {
            do {
                People user = new People();
                user.setId(cursor.getInt(cursor.getColumnIndex(Id)));
                user.setPassword(cursor.getString(cursor.getColumnIndex(Password)));
                user.setUsername(cursor.getString(cursor.getColumnIndex(Username)));
                list.add(user);
            } while (cursor.moveToNext());
        }
        return list;
    }
}
