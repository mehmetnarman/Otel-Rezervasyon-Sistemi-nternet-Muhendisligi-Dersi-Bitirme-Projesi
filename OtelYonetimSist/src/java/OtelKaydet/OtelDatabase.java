/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OtelKaydet;

import java.sql.*;

/**
 *
 * @author Mehmet NARMAN
 */
public class OtelDatabase {

    Connection con;

    public OtelDatabase(Connection con) {
        this.con = con;
    }

    public boolean saveOtel(Otel otel) {
        boolean set = false;
        try {
            //Insert register data to database
            String x = "insert into " + otel.getSehir() + "(oteladi,sehir) value(?,?)";
            String query = x;

            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, otel.getOteladi());
            pt.setString(2, otel.getSehir());
            pt.executeUpdate();
            set = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return set;
    }
}
