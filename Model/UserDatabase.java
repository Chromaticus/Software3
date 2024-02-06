package Model;

import utilitys.DatabaseConnect;
import utilitys.Helpers;

import java.sql.*;

public class UserDatabase {
    private static UserName currentUser;

    public static UserName getCurrentUser() {
        return currentUser;
    }

    // Login Attempt
    public static Boolean login(String Username, String Password) {
        try {
            Statement statement = DatabaseConnect.getConnection().createStatement();
            String loginCheck = "SELECT * FROM users WHERE User_ID='" + Username + "' AND Password='" + Password + "'";
            ResultSet rs = statement.executeQuery(loginCheck);
            if (rs.next()) {
                currentUser = new UserName();
                currentUser.setUsername(rs.getString("userName"));
                statement.close();

                return Boolean.TRUE;

            } else {
                return Boolean.FALSE;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /*needs work
    public static void addCustomer(String addName, String addAddress, String addPostalCode,String addState,String addCountry, String addPhoneNumber) {
        try (Connection connection = DatabaseConnect.getConnection();
             PreparedStatement customerStmt = connection.prepareStatement("INSERT INTO customer SET Customer_ID=?, Customer_Name=?, Address=?, Postal_Code=?, Phone=?")) {

            Integer addressID = assignAddressID();
            Integer customerID = assignCustomerID();
            String currentUser = UserDatabase.getCurrentUser().getUsername();


            customerStmt.setInt(1, customerID);
            customerStmt.setString(2, addName);
            customerStmt.setString(3, addAddress);
            customerStmt.setString(4, addPostalCode);
            customerStmt.setString(5, addPhoneNumber);
            customerStmt.executeUpdate();
            System.out.println("Successfully Added Customer");

        } catch (SQLException e) {
            // log error message and provide feedback to user
            e.printStackTrace();
        }
    }*/

}