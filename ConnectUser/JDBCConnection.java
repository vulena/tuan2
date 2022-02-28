/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectUser;
import java.sql.*;

public class JDBCConnection {

    public static Connection getJDBCConnection() throws SQLException {
        final String url = "jdbc:sqlserver://DESKTOP-MU64O7N:1433;databaseName =VuLeNa_netbeans";
        final String userName = "sa";
        final String password = "1234567";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
