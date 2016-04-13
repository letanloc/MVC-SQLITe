package efood.com.mvc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import efood.com.mvc.Controller.InsController;
import efood.com.mvc.Listener.IncListenner;
import efood.com.mvc.Model.People;
import efood.com.mvc.Untils.BaseActivity;

public class InsertActivity extends BaseActivity implements IncListenner {
    InsController insController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    EditText edtPass, edtUser;

    private void init() {
        edtUser = (EditText) Id(R.id.username);
        edtPass = (EditText) Id(R.id.passwod);
        insController = new InsController();
        (Id(R.id.bnt)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Emty(edtUser, edtPass)) {
                    insController.setIncListenner(InsertActivity.this);
                    insController.PeoleInsert(getApplicationContext(), new People(St(edtUser), St(edtPass)));
                    edtUser.setText("");
                    edtPass.setText("");
                }
            }
        });
    }

    @Override
    public void Insert(String People) {
        Toast.makeText(InsertActivity.this, (People != null ? "" + People : " Wrong"), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.loadList)
            startActivity(new Intent(getApplicationContext(), LoadList.class));
        return super.onOptionsItemSelected(item);
    }
}
