package principal;

import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Programa {
    public static void main(String[] args) {
        Connection connection;
        Statement stm = null;
        ResultSet rs = null;

        try{
            connection = DB.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery("SELECT * FROM DEPARTMENT");

            while (rs.next()){
                System.out.println(rs.getInt(1) + ", " + rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(stm);
            DB.closeConnection();
        }
    }
}
