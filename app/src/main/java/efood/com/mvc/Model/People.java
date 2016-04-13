package efood.com.mvc.Model;

import android.content.Context;
import android.util.Log;

import efood.com.mvc.Data.Dao.UserDao;
import efood.com.mvc.Listener.IncListenner;
import efood.com.mvc.Listener.ListListiener;

/**
 * Created by loc on 13/04/2016.
 */

// taih ckass su li doi tuong
public class People {
    UserDao userDao;
    private String Username;
    private String Password;

    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public People(String username, String password) {
        Username = username;
        Password = password;
    }

    public People() {
    }

    IncListenner incListenner;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    // tạo một phương thức insert để cho thằng insert listener còn thằng insert này nhạn từ thằng controller
    public String Insert(Context context, People user) {
        userDao = new UserDao(context);
        if (incListenner != null) {
            incListenner.Insert(user.toString());
            userDao.InsertUser(user);
        } else Log.e("TAG", "wrong");
        return user != null ? user.toString() : null;
    }

    public void setIncListenner(IncListenner incListenner) {
        this.incListenner = incListenner;
    }

    @Override
    public String toString() {
        return "Ten " + Username + " mat khau" + Password;
    }

    ListListiener listListiener;

    public void setListListiener(ListListiener listListiener) {
        this.listListiener = listListiener;
    }

    public void LoadAll(Context context) {
        if (listListiener != null) {
            userDao = new UserDao(context);
            listListiener.PeopleList(userDao.getAll());
        }
    }
}
