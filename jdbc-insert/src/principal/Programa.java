package principal;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class Programa {
    public static void main(String[] args) {
        Connection connection;
        PreparedStatement pstm = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            connection = DB.getConnection();
            String sql = "INSERT INTO SELLER(NAME, EMAIL, BIRTHDATE, BASESALARY, DEPARTMENTID) VALUES(?, ?, ?, ?, ?)";
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, "Vinicius Solon");
            pstm.setString(2,"Vini@gmail.com");
            pstm.setDate(3, new java.sql.Date(sdf.parse("13/12/1997").getTime()));
            pstm.setDouble(4,3000.0);
            pstm.setInt(5, 1);

            int rowsCheck = pstm.executeUpdate(); //Retorna o numero de linhas afetadas no banco de dados
            System.out.println(rowsCheck > 0);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(pstm);
            DB.closeConnection();
        }
    }
}
