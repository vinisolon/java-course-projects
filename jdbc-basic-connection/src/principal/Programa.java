package principal;

import db.DB;

import java.sql.Connection;

public class Programa {
    public static void main(String[] args) {
        Connection connection = DB.getConnection();
        DB.closeConnection();
    }
}
