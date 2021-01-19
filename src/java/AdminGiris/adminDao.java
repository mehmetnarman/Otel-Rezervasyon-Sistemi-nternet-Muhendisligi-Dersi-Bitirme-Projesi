/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminGiris;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.apache.catalina.User;

/**
 *
 * @author Mehmet NARMAN
 */
public class adminDao implements AdminService {
    
    private final Connection con;
    private String query;
    private PreparedStatement pst;
    private ResultSet rs;

    public adminDao(Connection con) {
        this.con = con;
    }

    @Override
    public Admin logAdmin(String email, String password) {
        Admin admin = null;
        try {
            query = "select * from admin where email=? and password=?";
            pst = this.con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {                //verilerimizi daha sonra almak için sonuç kümesi
                admin = new Admin();          //Admin modelimize verileri almak için
                admin.setId(rs.getInt("aid"));
                admin.setEmail(rs.getString("email"));
                admin.setName(rs.getString("name"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return admin;
    }

    public User logUser(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
