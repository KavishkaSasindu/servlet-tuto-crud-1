package dao;

import db.DbConnection;
import model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    Connection conn;

    public UserDao(){
        DbConnection dbConnection = new DbConnection();
        conn = dbConnection.getConnection();
    }

    public boolean addUser(UserModel userModel) throws SQLException{
        int insertRow = 0;
        try{
            final String INSERT_QUERY = "INSERT INTO new_user(username,email) Values(?,?)";
            PreparedStatement stmt = conn.prepareStatement(INSERT_QUERY);
            stmt.setString(1,userModel.getUsername());
            stmt.setString(2,userModel.getEmail());
            insertRow = stmt.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return insertRow>0;

    }
}
