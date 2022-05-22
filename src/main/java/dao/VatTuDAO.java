package dao;

import model.VatTu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VatTuDAO extends DBConnection{
    public List<VatTu> getAllVatTu() {
        String sql = "SELECT * FROM vat_tu";
        List<VatTu> vatTuList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                VatTu vatTu = new VatTu();
                vatTu.setId(rs.getString("id_vat_tu"));
                vatTu.setTen(rs.getString("ten_vat_tu"));
                vatTu.setGia(rs.getInt("gia"));
                vatTu.setDon_vi_tinh(rs.getString("don_vi_tinh"));
                vatTu.setSo_luong_ton(rs.getInt("so_luong_ton"));

                vatTuList.add(vatTu);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return vatTuList;
    }
}
