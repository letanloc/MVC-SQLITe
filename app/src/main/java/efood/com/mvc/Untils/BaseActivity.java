package efood.com.mvc.Untils;

import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/**
 * Created by loc on 13/04/2016.
 */
public class BaseActivity extends AppCompatActivity {
    public View Id(int id) {
        return findViewById(id);
    }

    public String St(Object o) {
        if (o instanceof EditText) return ((EditText) o).getText().toString();
        return null;
    }

    public boolean Emty(Object... obj) {
        for (Object o : obj)
            if (TextUtils.isEmpty(St(o))) return true;

        return false;
    }


}
