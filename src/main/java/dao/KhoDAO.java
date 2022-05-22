package dao;

import model.Kho;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class KhoDAO extends DBConnection{
    public List<Kho> getKhoByChiNhanh(String id_chi_nhanh){
        List<Kho> list = new ArrayList<>();
        String sql = "SELECT * FROM kho WHERE id_chi_nhanh = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id_chi_nhanh);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Kho kho = new Kho();
                kho.setId_kho(rs.getString("id_kho"));
                kho.setTen_kho(rs.getString("ten_kho"));
                kho.setDia_chi(rs.getString("dia_chi"));
                kho.setId_chi_nhanh(rs.getString("id_chi_nhanh"));
                list.add(kho);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return list;

    }
}
