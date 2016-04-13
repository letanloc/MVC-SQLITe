package efood.com.mvc.Controller;

import android.content.Context;

import efood.com.mvc.Listener.ListListiener;
import efood.com.mvc.Model.People;

/**
 * Created by loc on 13/04/2016.
 */
public class ListController {
    People people;

    public ListController() {
        people = new People();
    }


    ListListiener listListiener;


    public void LoadAll(Context context) {
        people.LoadAll(context);
    }

    public void setListListiener(ListListiener listListiener) {
     people.setListListiener(listListiener);
    }
}
