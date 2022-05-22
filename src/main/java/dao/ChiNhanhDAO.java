package dao;

import model.ChiNhanh;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChiNhanhDAO extends DBConnection{
    public List<ChiNhanh> getAllChiNhanh() {
        List<ChiNhanh> list = new ArrayList<>();

        String sql = "SELECT * FROM chi_nhanh";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiNhanh chiNhanh = new ChiNhanh();
                chiNhanh.setId_chi_nhanh(rs.getString("id_chi_nhanh"));
                chiNhanh.setChi_nhanh(rs.getString("chi_nhanh"));
                chiNhanh.setDia_chi(rs.getString("dia_chi"));
                chiNhanh.setSdt(rs.getString("so_dt"));
                list.add(chiNhanh);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static boolean checkChiNhanh(String id_chi_nhanh, String so_dt) {
        boolean check = false;
        String sql = "SELECT * FROM chi_nhanh WHERE id_chi_nhanh = ? AND so_dt = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id_chi_nhanh);
            ps.setString(2, so_dt);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                check = true;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

    public List<ChiNhanh> getChiNhanhByID(String id_chi_nhanh) {
        List<ChiNhanh> list = new ArrayList<>();

        String sql = "SELECT * FROM chi_nhanh WHERE id_chi_nhanh = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id_chi_nhanh);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiNhanh chiNhanh = new ChiNhanh();
                chiNhanh.setId_chi_nhanh(rs.getString("id_chi_nhanh"));
                chiNhanh.setChi_nhanh(rs.getString("chi_nhanh"));
                chiNhanh.setDia_chi(rs.getString("dia_chi"));
                chiNhanh.setSdt(rs.getString("so_dt"));
                list.add(chiNhanh);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
