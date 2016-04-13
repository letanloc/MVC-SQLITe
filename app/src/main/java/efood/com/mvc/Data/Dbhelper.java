package efood.com.mvc.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by loc on 13/04/2016.
 */
public class Dbhelper extends SQLiteOpenHelper implements Namedefault {
    /*--- || ---*/
    public Dbhelper(Context context) {
        super(context, "DEMO.SQLITE", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CreateTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
