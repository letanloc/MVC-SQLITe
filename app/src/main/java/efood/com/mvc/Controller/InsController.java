package efood.com.mvc.Controller;

import android.content.Context;

import efood.com.mvc.Listener.IncListenner;
import efood.com.mvc.Model.People;

/**
 * Created by loc on 13/04/2016.
 */
public class InsController {
    People people;

    public InsController() {
        people = new People();
    }

    public String PeoleInsert(Context context, People user) {
        return people.Insert(context, user);
    }

    public void setIncListenner(IncListenner incListenner) {
        people.setIncListenner(incListenner);
    }

}
