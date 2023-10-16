package tn.esprit.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tn.esprit.entity.Transport;
import tn.esprit.entity.reservation;

import tn.esprit.tools.MyDB;

public class ServiceTransport implements IServices<Transport> {


    public ServiceTransport() {
       
    }

    @Override
    public void addTransport(Transport transport) {
        try {
            String sql = "INSERT INTO transport (cap, type, dd, da) VALUES (?, ?, ?, ?)";
            PreparedStatement pre = MyDB.getInstance().getCon().prepareStatement(sql);
            pre.setInt(1, transport.getId());
            pre.setInt(2, transport.getCap());
            pre.setString(3, transport.getType());
            pre.setString(4, transport.getDd());
            pre.setString(5, transport.getDa());
            pre.executeUpdate();
           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @param transport
     */
    @Override
    public void updateTransport(Transport transport) {
        try {
            String sql = "UPDATE transport SET cap = ?, type = ?, dd = ?, da = ? WHERE id = ?";
            PreparedStatement pre = MyDB.getInstance().getCon().prepareStatement(sql);
            pre.setInt(1, transport.getCap());
            pre.setString(2, transport.getType());
            pre.setString(3, transport.getDd());
            pre.setString(4, transport.getDa());
            pre.setInt(5, transport.getId());
            pre.executeUpdate();
            pre.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

    @Override
    public void deleteTransport(int id) {
        try {
            String sql = "DELETE FROM transport WHERE id = ?";
            PreparedStatement pre = MyDB.getInstance().getCon().prepareStatement(sql);
            pre.setInt(1, id);
            pre.executeUpdate();
            pre.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Transport> getAllTransports() {
        List<Transport> transports = new ArrayList<>();

        try {
            String sql = "SELECT * FROM transport";
            Statement stmt =MyDB.getInstance().getCon().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                int cap = rs.getInt("cap");
                String type = rs.getString("type");
                String dd = rs.getString("dd");
                String da = rs.getString("da");
                transports.add(new Transport(id, cap, type, dd, da));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transports;
    }
    
    
       
}
