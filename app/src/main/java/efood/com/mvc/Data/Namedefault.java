package efood.com.mvc.Data;

/**
 * Created by loc on 13/04/2016.
 */
public interface Namedefault {
    String CreateTable = "CREATE TABLE \"USER\" " +
            "(\"Id\" INTEGER PRIMARY KEY  AUTOINCREMENT , " +
            "\"Username\" VARCHAR(255), " +
            "\"Password\" VARCHAR(255))";

    String USER = "USER", Id = "Id", Username = "Username", Password = "Password";

}
