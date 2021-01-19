/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sil;

import java.sql.*;

/**
 *
 * @author Mehmet NARMAN
 */
public class userDao implements UserService {
    private final Connection con;
    private String query;
    private PreparedStatement pst;
    private ResultSet rs;

    public userDao(Connection con) {
        this.con = con;
    }
    @Override
    public User logUser(String email, String password) {
        User user = null;
        try {
            query = "select * from user where email=? and password=?";
            pst = this.con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {                //verilerimizi daha sonra almak için sonuç kümesi
                user = new User();          //Admin modelimize verileri almak için
                user.setId(rs.getInt("uid"));
                user.setEmail(rs.getString("email"));
                user.setName(rs.getString("name"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return user;
    }
}
