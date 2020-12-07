package principal;

import db.DB;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Programa {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement stm = null;
        String sql = "DELETE FROM DEPARTMENT WHERE ID = ?";
        try {
            connection = DB.getConnection();
            stm = connection.prepareStatement(sql);
            stm.setDouble(1, 5);

            if(stm.executeUpdate() > 0){
                System.out.println("Sucesso!");
            } else {
                System.out.println("Falha!");
            }
        } catch (Exception e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(stm);
            DB.closeConnection();
        }
    }
}
