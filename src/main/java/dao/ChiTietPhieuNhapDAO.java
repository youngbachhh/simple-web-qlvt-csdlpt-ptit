package dao;

import model.ChiTietPhieuNhap;
import model.PhieuNhap;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChiTietPhieuNhapDAO extends DBConnection{
    public List<ChiTietPhieuNhap> getAllChiTietPhieuNhap() {
        List<ChiTietPhieuNhap> list = null;
        String sql = "SELECT * FROM chi_tiet_phieu_nhap";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            list = new ArrayList<>();
            while (rs.next()) {
                ChiTietPhieuNhap chiTietPhieuNhap = new ChiTietPhieuNhap();
                chiTietPhieuNhap.setId_phieu_nhap(rs.getString("id_phieu_nhap"));
                chiTietPhieuNhap.setId_vat_tu(rs.getString("id_vat_tu"));
                chiTietPhieuNhap.setSo_luong(rs.getInt("so_luong"));
                chiTietPhieuNhap.setDon_gia(rs.getInt("don_gia"));
                list.add(chiTietPhieuNhap);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }


    public List<ChiTietPhieuNhap> getChiTietPhieuNhapByID(String id_phieu_nhap) {
        List<ChiTietPhieuNhap> list = null;
        List<PhieuNhap> listPhieuNhap = new ArrayList<>(new PhieuNhapDAO().getPhieuNhapByID(id_phieu_nhap));
        String sql = "SELECT * FROM chi_tiet_phieu_nhap where id_phieu_nhap = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id_phieu_nhap);
            ResultSet rs = ps.executeQuery();
            list = new ArrayList<>();
            while (rs.next()) {
                ChiTietPhieuNhap chiTietPhieuNhap = new ChiTietPhieuNhap();
                chiTietPhieuNhap.setId_phieu_nhap(rs.getString("id_phieu_nhap"));
                chiTietPhieuNhap.setNgay(listPhieuNhap.get(0).getNgay());
                chiTietPhieuNhap.setId_don_dat_hang(listPhieuNhap.get(0).getId_don_dat_hang());
                chiTietPhieuNhap.setId_kho(listPhieuNhap.get(0).getId_kho());
                chiTietPhieuNhap.setId_nhan_vien(listPhieuNhap.get(0).getId_nhan_vien());
                chiTietPhieuNhap.setId_vat_tu(rs.getString("id_vat_tu"));
                chiTietPhieuNhap.setSo_luong(rs.getInt("so_luong"));
                chiTietPhieuNhap.setDon_gia(rs.getInt("don_gia"));
                list.add(chiTietPhieuNhap);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

}
