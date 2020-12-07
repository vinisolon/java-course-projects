package principal;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Programa {
    public static void main(String[] args) {
        Connection connection = null;
        Statement stm = null;
        try {
            connection = DB.getConnection();
            connection.setAutoCommit(false);
            stm = connection.createStatement();

            stm.executeUpdate("UPDATE SELLER SET BASESALARY = 2500 WHERE DEPARTMENTID = 1");

            /*int x = 0;
            if(x > 0)
                throw new SQLException("erro fake");*/

            stm.executeUpdate("UPDATE SELLER SET BASESALARY = 1800 WHERE DEPARTMENTID = 2");
            connection.commit();
        } catch (Exception e) {
            try {
                connection.rollback();
                throw new DbException("Rollback! " + e.getMessage());
            } catch (SQLException msg) {
                throw new DbException("ERROR ROLLBACK! " + msg.getMessage());
            }
        } finally {
            DB.closeStatement(stm);
            DB.closeConnection();
        }
    }
}
