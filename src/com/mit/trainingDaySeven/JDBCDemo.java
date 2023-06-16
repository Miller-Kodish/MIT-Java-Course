package com.mit.trainingDaySeven;

import java.sql.*;
/* Equivalent to:
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 */


public class JDBCDemo {

    public static void main(String[] args) {//throws ClassNotFoundException,SQLException{

        String jdbcURL = "jdbc:db2://127.0.0.1:50000/MDMDB_1";  // URL of database server (in this case localhost)
        String jdbcDriver = "com.ibm.db2.jcc.DB2Driver";    // name of driver
        String jdbcUsername = "db2admin";   // user name
        String jdbcPassword = "db2@dmin";   // password

        try {
            int x = 100;    // Initial value of x
            int y = 0;  // Initial value of y
            int result = x / y;  // Divide by zero exception (no errors but gives warning)
        } catch (ArithmeticException arithmeticException) {    // Arithmetic exception
            System.err.println(arithmeticException);
        } catch (Exception exception) { // General exception
            System.err.println(exception);
        } finally { // Finally block
            System.out.println("Done");
        }


        try {   // Try to load the JDBC driver
            Class.forName(jdbcDriver);
            Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            System.out.println("CONNECTED");

            String sql1 = "SELECT * FROM CONTACT WHERE CONT_ID=? AND PREF_LANG_TP_CD=?";

            Statement stmt = connection.createStatement();
            //ResultSet resultSet = stmt.executeQuery(sql1);

            PreparedStatement preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.setString(1, "311111111");
            preparedStatement.setString(2, "101");
            ResultSet resultSet = preparedStatement.executeQuery();

            //System.out.println("TEST="+resultSet.getFetchSize());
            while (resultSet.next()) {
                String contID = resultSet.getString("CONTACT_NAME");// getString("CONT_ID");
                System.out.println(contID);
            }


            resultSet.close();  // Close the result set
            stmt.close();   // Close the statement
            String sql2 = "INSERT CONTACT SET PREF_LANG_TP_CD=101 WHERE CONT_ID=?";
            int result = stmt.executeUpdate(sql2);
            connection.close(); // Close the connection


        } catch (ClassNotFoundException classException) {    // Driver not found exception
            // TODO: handle exception
            System.err.println(classException);
        } catch (SQLException sqlException) {  // SQL exception
            // TODO: handle exception
            System.err.println(sqlException);
        }

    }


    public static Connection createConnection() throws SQLException, ClassNotFoundException {
        // Throws - If not used, the calling method will have to handle the exception
        // Will not handle exception here, but will pass it to the calling method

        String jdbcURL = "jdbc:db2://127.0.0.1:50000/ANKAN_1";
        String jdbcDriver = "com.ibm.db2.jcc.DB2Driver";
        String jdbcUsername = "db2admin";
        String jdbcPassword = "db2admin";

        return createConnection(jdbcURL, jdbcDriver, jdbcUsername, jdbcPassword);
    }

    public static Connection createConnection(String jdbcURL,
                                              String jdbcDriver, String jdbcUsername, String jdbcPassword) throws SQLException,
            ClassNotFoundException {
        Class.forName(jdbcDriver);
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

}