package com.maren.myfirstproject.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class BatchCtrl 
{
	public static Connection getConnection()throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3360/test", "root", "root");
}
 
    private static String INSERT = "INSERT INTO test.student (userid, name, email, mobile) VALUES (?, ?, ?, ?)";

    public static void main(String[] args) throws ClassNotFoundException {
        Connection conn043 = null;
        PreparedStatement pstmt043 = null;
        PreparedStatement pstmt2043 = null;
        try {
            conn043 = getConnection();
        } catch (SQLException e) {
        	e.printStackTrace();
            System.err.println("There was an error getting the connection");
        }
        try {
            conn043.setAutoCommit(false);
            System.err.println("The autocommit was disabled!");
        } catch (SQLException e) {
            System.err.println("There was an error disabling autocommit");
        }
        // Starts JDBC Transaction
        try {
            pstmt043 = conn043.prepareStatement(INSERT);
            pstmt2043 = conn043.prepareStatement(INSERT);
             
            pstmt043.setInt(1,043);
            pstmt043.setString(2, "Amisha");
            pstmt043.setString(3, "amisha@gmail.com");
            pstmt043.setInt(4,981060);
            
            pstmt043.addBatch();
            int[] count1=pstmt043.executeBatch();
             
            pstmt2043.setInt(1,142);
            pstmt2043.setString(2, "Amit");
            pstmt2043.setString(3, "amit@gmail.com");
            pstmt2043.setInt(4,936572);
           
            pstmt2043.addBatch();
            
            int[] count=pstmt2043.executeBatch();             
            conn043.commit();
            System.err.println("The transaction was successfully executed");
        } catch (SQLException e) {
            try {
                //We rollback the transaction, atomicity!
                conn043.rollback();
                System.err.println(e.getMessage());
                System.err.println("The transaction was rollback");
            } catch (SQLException e1) {
                System.err.println("There was an error making a rollback");
            }
        }
    }
}