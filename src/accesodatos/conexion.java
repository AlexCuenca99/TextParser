/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO_5
 */
public class conexion {
    protected Connection connection;

    public Connection open() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_datostxt", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.connection;
    }

    public ResultSet query(String query) {
        Statement st;      
        ResultSet rs = null;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public boolean execute(String query) {
        Statement st;
        boolean save = true;

        try {
            st = connection.createStatement();
            st.executeUpdate(query);
        } catch (SQLException e) {
            save = false;
            e.printStackTrace();
        }
        return save;
    }

    public boolean close() {
        boolean ok = true;

        try {
            connection.close();
        } catch (Exception e) {
            ok = false;
            e.printStackTrace(); 
        }
        return ok;
    }
}
