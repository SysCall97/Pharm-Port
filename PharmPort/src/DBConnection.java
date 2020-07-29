/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Expression KAZI_NUR_ALAM_MASHRY is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */

import java.sql.*;

public class DBConnection {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    private static final String CONN_STRING = 
            "jdbc:mysql://localhost/3_1_project";
    
    public static Connection connectDB() {
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            return conn;
        } catch(SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}
