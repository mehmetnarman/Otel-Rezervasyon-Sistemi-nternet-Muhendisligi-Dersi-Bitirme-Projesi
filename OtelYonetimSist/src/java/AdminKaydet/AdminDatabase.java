/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminKaydet;

import AdminGiris.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Mehmet NARMAN
 */
public class AdminDatabase {

    Connection con;

    public AdminDatabase(Connection con) {
        this.con = con;
    }

    //for register admin
    public boolean saveAdmin(Admin admin) {
        boolean set = false;
        try {
            //Insert register data to database
            String query = "insert into admin(name,email,password) values(?,?,?)";

            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, admin.getName());
            pt.setString(2, admin.getEmail());
            pt.setString(3, admin.getPassword());

            pt.executeUpdate();
            set = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return set;
    }
}
