package DAO;

import com.mysql.cj.jdbc.MysqlDataSource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;


public class ConnexionMyAdmin {


    String url = "jdbc:mysql://localhost:3306/applijeux";
    String user = "root";
    String password = "";


    public void init(ServletConfig config) throws ServletException {

        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl(url);
        dataSource.setPassword(password);
        dataSource.setUser(user);
    }
}
