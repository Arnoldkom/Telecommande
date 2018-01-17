/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Arnoldkom
 */
public class ConnectionDB {
     private Connection con;
    
    public Connection connect(){
        if(con == null){
            MysqlDataSource db = new MysqlDataSource();
            db.setDatabaseName("telecommande");
            db.setUser("root");
            db.setPassword("");
            try {
                con = db.getConnection();
            } catch (SQLException e) {
            }
        }
        return con;
    }
}
