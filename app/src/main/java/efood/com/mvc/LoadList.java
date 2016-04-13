package efood.com.mvc;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import efood.com.mvc.Adapter.PeopleAdapter;
import efood.com.mvc.Controller.ListController;
import efood.com.mvc.Listener.ListListiener;
import efood.com.mvc.Model.People;
import efood.com.mvc.Untils.BaseActivity;

public class LoadList extends BaseActivity implements ListListiener {
    RecyclerView list_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_list);
        init();
        ListController listController = new ListController();
        listController.setListListiener(this);
        listController.LoadAll(this);

    }

    private void init() {
        list_item = (RecyclerView) Id(R.id.list_item);
        list_item.setLayoutManager(new LinearLayoutManager(this));
        list_item.setHasFixedSize(true);
    }

    @Override
    public void PeopleList(List<People> list) {
        list_item.setAdapter(new PeopleAdapter(list));
    }
}
