package com.example.ecommerce;

import com.example.ecomm.DatabaseConnection;
import javafx.scene.chart.PieChart;

import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.example.ecomm.Login.toHexString;

public class SignUp {
    String name;
    String pass;
    String email;
    String mobile;
    String address;

    public static void customerSignup(String userName, String userMobile, String userEmail, String userPass, String userAddress) throws NoSuchAlgorithmException {
        // insert into customers (name, email, mobile, password) values ('Salim Ansari','ansariboy@gmail.com','4678676467','boyansari');
        String encryptedPassword = toHexString(userPass);
        //System.out.println("This is the encrypted password --> " + encryptedPassword);
        String query = "insert into customers(name, email, mobile, password, address)values('"+userName+"','"+userEmail+"','"+userMobile+"','"+encryptedPassword+"','"+userAddress+"')";
        DatabaseConnection dbConn = new DatabaseConnection();
        dbConn.insertUpdate(query);
    }
}
