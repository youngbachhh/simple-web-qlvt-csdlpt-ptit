package dao;

import model.NhanVien;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO extends DBConnection{
    public List<NhanVien> getAllNhanVien() {
        List<NhanVien> list = new ArrayList<>();
        String sql = "SELECT * FROM nhan_vien";
        try {
            PreparedStatement ps  = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setId_nhan_vien(rs.getInt("id_nhan_vien"));
                nhanVien.setHo(rs.getString("ho"));
                nhanVien.setTen(rs.getString("ten"));
                nhanVien.setNgay_sinh(rs.getString("ngay_sinh"));
                nhanVien.setGioi_tinh(rs.getString("gioi_tinh"));
                nhanVien.setDia_chi(rs.getString("dia_chi"));
                nhanVien.setLuong(rs.getInt("luong"));
                nhanVien.setId_chi_nhanh(rs.getString("id_chi_nhanh"));
                list.add(nhanVien);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }



    public List<NhanVien> getNhanVienByIDChiNhanh(String id_chi_nhanh) {
        List<NhanVien> list = new ArrayList<>();
        String sql = "SELECT * FROM nhan_vien where id_chi_nhanh = ?";
        try {
            PreparedStatement ps  = connection.prepareStatement(sql);
            ps.setString(1, id_chi_nhanh);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setId_nhan_vien(rs.getInt("id_nhan_vien"));
                nhanVien.setHo(rs.getString("ho"));
                nhanVien.setTen(rs.getString("ten"));
                nhanVien.setNgay_sinh(rs.getString("ngay_sinh"));
                nhanVien.setGioi_tinh(rs.getString("gioi_tinh"));
                nhanVien.setDia_chi(rs.getString("dia_chi"));
                nhanVien.setLuong(rs.getInt("luong"));
                nhanVien.setId_chi_nhanh(rs.getString("id_chi_nhanh"));
                list.add(nhanVien);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

}
