package principal;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Programa {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement stm = null;
        String sql = "UPDATE SELLER SET BASESALARY = BASESALARY * ? WHERE DEPARTMENTID = ?";
        try {
            connection = DB.getConnection();
            stm = connection.prepareStatement(sql);
            stm.setDouble(1, 1.1); //10%
            stm.setInt(2, 1);

            if(stm.executeUpdate() > 0){
                System.out.println("Sucesso!");
            } else {
                System.out.println("Falha!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(stm);
            DB.closeConnection();
        }
    }
}
