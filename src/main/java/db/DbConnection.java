package db;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    Connection conn=null;

    final String USERNAME = "root";
    final String PASSWORD = "mysql";
    final String URL = "jdbc:mysql://localhost:3306/new_crud";

public Connection getConnection(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }catch(Exception e){
        e.printStackTrace();
        System.out.println(e.getMessage());
    }
    return conn;
}

}
